'ByteArrayOutputStream' @ [48:16] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'apply' @ [48:40] ==> @InlineOnly public inline fun <T> ByteArrayOutputStream.apply(block: ByteArrayOutputStream.() -> Unit): ByteArrayOutputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'stringTable' @ [49:13] ==> public final val stringTable: StringTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeTo' @ [49:25] ==> public abstract fun serializeTo(output: OutputStream): Unit defined in org.jetbrains.kotlin.serialization.StringTable[SimpleFunctionDescriptorImpl]

'this' @ [49:37] ==> <this> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.serialize.<anonymous>[ReceiverParameterDescriptorImpl]

'message' @ [50:13] ==> value-parameter message: MessageLite defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.serialize[ValueParameterDescriptorImpl]

'writeTo' @ [50:21] ==> public abstract fun writeTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.protobuf.MessageLite[JavaMethodDescriptor]

'this' @ [50:29] ==> <this> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.serialize.<anonymous>[ReceiverParameterDescriptorImpl]

'toByteArray' @ [51:11] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'DescriptorSerializer' @ [55:13] ==> private constructor DescriptorSerializer(containingDeclaration: DeclarationDescriptor?, typeParameters: Interner<TypeParameterDescriptor>, extension: SerializerExtension, typeTable: MutableTypeTable, sinceKotlinInfoTable: MutableSinceKotlinInfoTable, serializeTypeTableToFunction: Boolean) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[ClassConstructorDescriptorImpl]

'descriptor' @ [55:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.createChildSerializer[ValueParameterDescriptorImpl]

'Interner' @ [55:46] ==> public constructor Interner<T : (Any..Any?)>(p0: (Interner<(TypeParameterDescriptor..TypeParameterDescriptor?)>..Interner<(TypeParameterDescriptor..TypeParameterDescriptor?)>?)) defined in org.jetbrains.kotlin.utils.Interner[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeParameters' @ [55:55] ==> private final val typeParameters: Interner<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'extension' @ [55:72] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'typeTable' @ [55:83] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'sinceKotlinInfoTable' @ [55:94] ==> private final val sinceKotlinInfoTable: MutableSinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'extension' @ [59:17] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'stringTable' @ [59:27] ==> public abstract val stringTable: StringTable defined in org.jetbrains.kotlin.serialization.SerializerExtension[PropertyDescriptorImpl]

'extension' @ [61:43] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'shouldUseTypeTable' @ [61:53] ==> public open fun shouldUseTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'newBuilder' @ [64:38] ==> public open fun newBuilder(): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'getClassFlags' @ [66:27] ==> public open fun getClassFlags(p0: Boolean, p1: (Visibility..Visibility?), p2: (Modality..Modality?), p3: (ClassKind..ClassKind?), p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [67:17] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [67:32] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'classDescriptor' @ [67:50] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'visibility' @ [67:66] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'classDescriptor' @ [67:78] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'modality' @ [67:94] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'classDescriptor' @ [67:104] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'kind' @ [67:120] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'classDescriptor' @ [68:17] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'isInner' @ [68:33] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [68:42] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'isCompanionObject' @ [68:58] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [68:77] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'isData' @ [68:93] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [68:101] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'isExternal' @ [68:117] ==> public final val ClassDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [69:17] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'isHeader' @ [69:33] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'flags' @ [71:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [71:22] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'flags' @ [71:30] ==> public final var ProtoBuf.Class.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [72:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'flags' @ [72:21] ==> public final var ProtoBuf.Class.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [72:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [75:9] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'fqName' @ [75:17] ==> public final var ProtoBuf.Class.Builder.fqName: Int[MyPropertyDescriptor]

'getClassifierId' @ [75:26] ==> private final fun getClassifierId(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [75:42] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'classDescriptor' @ [77:41] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [77:57] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'builder' @ [78:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addTypeParameter' @ [78:21] ==> public open fun addTypeParameter(p0: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'typeParameter' @ [78:38] ==> private final fun typeParameter(typeParameter: TypeParameterDescriptor): ProtoBuf.TypeParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [78:52] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'!' @ [81:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSpecialClassWithNoSupertypes' @ [81:29] ==> public open fun isSpecialClassWithNoSupertypes(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'classDescriptor' @ [81:60] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'classDescriptor' @ [83:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'typeConstructor' @ [83:47] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [83:63] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'if (useTypeTable()) {
                    builder.addSupertypeId(typeId(supertype))
                }
                else {
                    builder.addSupertype(type(supertype))
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?), elseBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder?)

'useTypeTable' @ [84:21] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [85:21] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addSupertypeId' @ [85:29] ==> public open fun addSupertypeId(p0: Int): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'typeId' @ [85:44] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'supertype' @ [85:51] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [88:21] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addSupertype' @ [88:29] ==> public open fun addSupertype(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'type' @ [88:42] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'supertype' @ [88:47] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'classDescriptor' @ [93:28] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'constructors' @ [93:44] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'builder' @ [94:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addConstructor' @ [94:21] ==> public open fun addConstructor(p0: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'constructorProto' @ [94:36] ==> public final fun constructorProto(descriptor: ConstructorDescriptor): ProtoBuf.Constructor.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [94:53] ==> val descriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'sort' @ [97:28] ==> public final fun <T : DeclarationDescriptor> sort(descriptors: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DeclarationDescriptor> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'getAllDescriptors' @ [97:49] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [97:67] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'defaultType' @ [97:83] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [97:95] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'descriptor' @ [98:17] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'descriptor' @ [99:21] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'kind' @ [99:32] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [99:70] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'when (descriptor) {
                    is PropertyDescriptor -> builder.addProperty(propertyProto(descriptor))
                    is FunctionDescriptor -> builder.addFunction(functionProto(descriptor))
                }' @ [101:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?), entry1: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder?)

'descriptor' @ [101:23] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [102:46] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addProperty' @ [102:54] ==> public open fun addProperty(p0: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'propertyProto' @ [102:66] ==> public final fun propertyProto(descriptor: PropertyDescriptor): ProtoBuf.Property.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [102:80] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [103:46] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addFunction' @ [103:54] ==> public open fun addFunction(p0: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'functionProto' @ [103:66] ==> public final fun functionProto(descriptor: FunctionDescriptor): ProtoBuf.Function.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [103:80] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'sort' @ [108:28] ==> public final fun <T : DeclarationDescriptor> sort(descriptors: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DeclarationDescriptor> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'getAllDescriptors' @ [108:49] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [108:67] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [108:83] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'if (descriptor is TypeAliasDescriptor) {
                builder.addTypeAlias(typeAliasProto(descriptor))
            }
            else {
                val name = getSimpleNameIndex(descriptor.name)
                if (isEnumEntry(descriptor)) {
                    builder.addEnumEntry(enumEntryProto(descriptor as ClassDescriptor))
                }
                else {
                    builder.addNestedClassName(name)
                }
            }' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?), elseBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder?)

'descriptor' @ [109:17] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [110:17] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addTypeAlias' @ [110:25] ==> public open fun addTypeAlias(p0: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'typeAliasProto' @ [110:38] ==> public final fun typeAliasProto(descriptor: TypeAliasDescriptor): ProtoBuf.TypeAlias.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [110:53] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'getSimpleNameIndex' @ [113:28] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [113:47] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'name' @ [113:58] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'if (isEnumEntry(descriptor)) {
                    builder.addEnumEntry(enumEntryProto(descriptor as ClassDescriptor))
                }
                else {
                    builder.addNestedClassName(name)
                }' @ [114:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?), elseBranch: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder?)

'isEnumEntry' @ [114:21] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [114:33] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [115:21] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addEnumEntry' @ [115:29] ==> public open fun addEnumEntry(p0: (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'enumEntryProto' @ [115:42] ==> public final fun enumEntryProto(descriptor: ClassDescriptor): ProtoBuf.EnumEntry.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [115:57] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [118:21] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addNestedClassName' @ [118:29] ==> public open fun addNestedClassName(p0: Int): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'name' @ [118:48] ==> val name: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'classDescriptor' @ [123:32] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'sealedSubclasses' @ [123:48] ==> public final val ClassDescriptor.sealedSubclasses: Collection<(ClassDescriptor..ClassDescriptor?)>[MyPropertyDescriptor]

'builder' @ [124:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'addSealedSubclassFqName' @ [124:21] ==> public open fun addSealedSubclassFqName(p0: Int): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'getClassifierId' @ [124:45] ==> private final fun getClassifierId(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'sealedSubclass' @ [124:61] ==> val sealedSubclass: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'classDescriptor' @ [127:41] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [127:57] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'companionObjectDescriptor' @ [128:13] ==> val companionObjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [129:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'companionObjectName' @ [129:21] ==> public final var ProtoBuf.Class.Builder.companionObjectName: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [129:43] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'companionObjectDescriptor' @ [129:62] ==> val companionObjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'name' @ [129:88] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'typeTable' @ [132:30] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serialize' @ [132:40] ==> @Suppress public final fun serialize(): ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.MutableTypeTable[SimpleFunctionDescriptorImpl]

'typeTableProto' @ [133:13] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [134:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'typeTable' @ [134:21] ==> public final var ProtoBuf.Class.Builder.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'typeTableProto' @ [134:33] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'sinceKotlinInfoTable' @ [137:36] ==> private final val sinceKotlinInfoTable: MutableSinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serialize' @ [137:57] ==> @Suppress public final fun serialize(): ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable[SimpleFunctionDescriptorImpl]

'sinceKotlinInfoProto' @ [138:13] ==> val sinceKotlinInfoProto: ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [139:13] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'sinceKotlinInfoTable' @ [139:21] ==> public final var ProtoBuf.Class.Builder.sinceKotlinInfoTable: (ProtoBuf.SinceKotlinInfoTable..ProtoBuf.SinceKotlinInfoTable?)[MyPropertyDescriptor]

'sinceKotlinInfoProto' @ [139:44] ==> val sinceKotlinInfoProto: ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'extension' @ [142:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeClass' @ [142:19] ==> public open fun serializeClass(descriptor: ClassDescriptor, proto: ProtoBuf.Class.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [142:34] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[ValueParameterDescriptorImpl]

'builder' @ [142:51] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'builder' @ [144:16] ==> val builder: (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.classProto[LocalVariableDescriptor]

'newBuilder' @ [148:41] ==> public open fun newBuilder(): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'createChildSerializer' @ [150:21] ==> private final fun createChildSerializer(descriptor: DeclarationDescriptor): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [150:43] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'descriptor' @ [155:35] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'compileTimeInitializer' @ [155:46] ==> public final val PropertyDescriptor.compileTimeInitializer: ConstantValue<*>?[MyPropertyDescriptor]

'compileTimeConstant' @ [156:27] ==> val compileTimeConstant: ConstantValue<*>? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'compileTimeConstant' @ [156:58] ==> val compileTimeConstant: ConstantValue<*>? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [158:30] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'annotations' @ [158:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'getAllAnnotations' @ [158:53] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'isNotEmpty' @ [158:73] ==> @InlineOnly public inline fun <T> Collection<AnnotationWithTarget>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'getAccessorFlags' @ [160:35] ==> public open fun getAccessorFlags(p0: Boolean, @NotNull p1: Visibility, @NotNull p2: Modality, p3: Boolean, p4: Boolean, p5: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [160:52] ==> val hasAnnotations: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [160:68] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'visibility' @ [160:79] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [160:91] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'modality' @ [160:102] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'descriptor' @ [162:22] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'getter' @ [162:33] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getter' @ [163:13] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'hasGetter' @ [164:13] ==> var hasGetter: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'getAccessorFlags' @ [165:33] ==> private final fun getAccessorFlags(accessor: PropertyAccessorDescriptor): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'getter' @ [165:50] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'accessorFlags' @ [166:17] ==> val accessorFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'propertyFlags' @ [166:34] ==> val propertyFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'builder' @ [167:17] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'getterFlags' @ [167:25] ==> public final var ProtoBuf.Property.Builder.getterFlags: Int[MyPropertyDescriptor]

'accessorFlags' @ [167:39] ==> val accessorFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [171:22] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'setter' @ [171:33] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [172:13] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'hasSetter' @ [173:13] ==> var hasSetter: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'getAccessorFlags' @ [174:33] ==> private final fun getAccessorFlags(accessor: PropertyAccessorDescriptor): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'setter' @ [174:50] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'accessorFlags' @ [175:17] ==> val accessorFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'propertyFlags' @ [175:34] ==> val propertyFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'builder' @ [176:17] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'setterFlags' @ [176:25] ==> public final var ProtoBuf.Property.Builder.setterFlags: Int[MyPropertyDescriptor]

'accessorFlags' @ [176:39] ==> val accessorFlags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'!' @ [179:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'setter' @ [179:18] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'isDefault' @ [179:25] ==> public final val PropertySetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'local' @ [180:35] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'createChildSerializer' @ [180:41] ==> private final fun createChildSerializer(descriptor: DeclarationDescriptor): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'setter' @ [180:63] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'setter' @ [181:50] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'valueParameters' @ [181:57] ==> public final val PropertySetterDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'builder' @ [182:21] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'setSetterValueParameter' @ [182:29] ==> public open fun setSetterValueParameter(p0: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]

'setterLocal' @ [182:53] ==> val setterLocal: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'valueParameter' @ [182:65] ==> private final fun valueParameter(descriptor: ValueParameterDescriptor): ProtoBuf.ValueParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'valueParameterDescriptor' @ [182:80] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'getPropertyFlags' @ [187:27] ==> public open fun getPropertyFlags(p0: Boolean, @NotNull p1: Visibility, @NotNull p2: Modality, @NotNull p3: CallableMemberDescriptor.Kind, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [188:17] ==> val hasAnnotations: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [188:33] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'visibility' @ [188:44] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [188:56] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'modality' @ [188:67] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'descriptor' @ [188:77] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'kind' @ [188:88] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'descriptor' @ [188:94] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isVar' @ [188:105] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'hasGetter' @ [189:17] ==> var hasGetter: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'hasSetter' @ [189:28] ==> var hasSetter: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'hasConstant' @ [189:39] ==> val hasConstant: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [189:52] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isConst' @ [189:63] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'descriptor' @ [189:72] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isLateInit' @ [189:83] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'descriptor' @ [189:95] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isExternal' @ [189:106] ==> public final val PropertyDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'Suppress' @ [190:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [190:42] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isDelegated' @ [190:53] ==> @Deprecated public abstract val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [190:66] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isHeader' @ [190:77] ==> public final val PropertyDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'flags' @ [192:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'builder' @ [192:22] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'flags' @ [192:30] ==> public final var ProtoBuf.Property.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [193:13] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'flags' @ [193:21] ==> public final var ProtoBuf.Property.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [193:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'builder' @ [196:9] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'name' @ [196:17] ==> public final var ProtoBuf.Property.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [196:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [196:43] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'name' @ [196:54] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'if (useTypeTable()) {
            builder.returnTypeId = local.typeId(descriptor.type)
        }
        else {
            builder.setReturnType(local.type(descriptor.type))
        }' @ [198:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [198:13] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [199:13] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'returnTypeId' @ [199:21] ==> public final var ProtoBuf.Property.Builder.returnTypeId: Int[MyPropertyDescriptor]

'local' @ [199:36] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'typeId' @ [199:42] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [199:49] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'type' @ [199:60] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'builder' @ [202:13] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'setReturnType' @ [202:21] ==> public open fun setReturnType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]

'local' @ [202:35] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'type' @ [202:41] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [202:46] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'type' @ [202:57] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [205:41] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'typeParameters' @ [205:52] ==> public final val PropertyDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'builder' @ [206:13] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'addTypeParameter' @ [206:21] ==> public open fun addTypeParameter(p0: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]

'local' @ [206:38] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'typeParameter' @ [206:44] ==> private final fun typeParameter(typeParameter: TypeParameterDescriptor): ProtoBuf.TypeParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [206:58] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'descriptor' @ [209:33] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [209:44] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverParameter' @ [210:13] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.receiverTypeId = local.typeId(receiverParameter.type)
            }
            else {
                builder.setReceiverType(local.type(receiverParameter.type))
            }' @ [211:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [211:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [212:17] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'receiverTypeId' @ [212:25] ==> public final var ProtoBuf.Property.Builder.receiverTypeId: Int[MyPropertyDescriptor]

'local' @ [212:42] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'typeId' @ [212:48] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [212:55] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'type' @ [212:73] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'builder' @ [215:17] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'setReceiverType' @ [215:25] ==> public open fun setReceiverType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]

'local' @ [215:41] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'type' @ [215:47] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [215:52] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'type' @ [215:70] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [219:13] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'isSuspendOrHasSuspendTypesInSignature' @ [219:24] ==> private final fun CallableMemberDescriptor.isSuspendOrHasSuspendTypesInSignature(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [220:13] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'sinceKotlinInfo' @ [220:21] ==> public final var ProtoBuf.Property.Builder.sinceKotlinInfo: Int[MyPropertyDescriptor]

'writeSinceKotlinInfo' @ [220:39] ==> private final fun writeSinceKotlinInfo(languageFeature: LanguageFeature): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'Coroutines' @ [220:76] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'extension' @ [223:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeProperty' @ [223:19] ==> public open fun serializeProperty(descriptor: PropertyDescriptor, proto: ProtoBuf.Property.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [223:37] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[ValueParameterDescriptorImpl]

'builder' @ [223:49] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'builder' @ [225:16] ==> val builder: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.propertyProto[LocalVariableDescriptor]

'newBuilder' @ [229:41] ==> public open fun newBuilder(): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'createChildSerializer' @ [231:21] ==> private final fun createChildSerializer(descriptor: DeclarationDescriptor): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [231:43] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'getFunctionFlags' @ [233:27] ==> public open fun getFunctionFlags(p0: Boolean, @NotNull p1: Visibility, @NotNull p2: Modality, @NotNull p3: CallableMemberDescriptor.Kind, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean, p9: Boolean, p10: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [234:17] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [234:32] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'descriptor' @ [234:45] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'visibility' @ [234:56] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [234:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'modality' @ [234:79] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'descriptor' @ [234:89] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'kind' @ [234:100] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'descriptor' @ [234:106] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isOperator' @ [234:117] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'descriptor' @ [235:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isInfix' @ [235:28] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'descriptor' @ [235:37] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isInline' @ [235:48] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'descriptor' @ [235:58] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isTailrec' @ [235:69] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'descriptor' @ [235:80] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isExternal' @ [235:91] ==> public final val FunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'descriptor' @ [235:103] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isSuspend' @ [235:114] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'descriptor' @ [236:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isHeader' @ [236:28] ==> public final val FunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'flags' @ [238:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'builder' @ [238:22] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'flags' @ [238:30] ==> public final var ProtoBuf.Function.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [239:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'flags' @ [239:21] ==> public final var ProtoBuf.Function.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [239:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'builder' @ [242:9] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'name' @ [242:17] ==> public final var ProtoBuf.Function.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [242:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [242:43] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'name' @ [242:54] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'if (useTypeTable()) {
            builder.returnTypeId = local.typeId(descriptor.returnType!!)
        }
        else {
            builder.setReturnType(local.type(descriptor.returnType!!))
        }' @ [244:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [244:13] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [245:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'returnTypeId' @ [245:21] ==> public final var ProtoBuf.Function.Builder.returnTypeId: Int[MyPropertyDescriptor]

'local' @ [245:36] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'typeId' @ [245:42] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [245:49] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'returnType' @ [245:60] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'builder' @ [248:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'setReturnType' @ [248:21] ==> public open fun setReturnType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function.Builder[JavaMethodDescriptor]

'local' @ [248:35] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'type' @ [248:41] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [248:46] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'returnType' @ [248:57] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'descriptor' @ [251:41] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'typeParameters' @ [251:52] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'builder' @ [252:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'addTypeParameter' @ [252:21] ==> public open fun addTypeParameter(p0: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function.Builder[JavaMethodDescriptor]

'local' @ [252:38] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'typeParameter' @ [252:44] ==> private final fun typeParameter(typeParameter: TypeParameterDescriptor): ProtoBuf.TypeParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [252:58] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'descriptor' @ [255:33] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [255:44] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverParameter' @ [256:13] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.receiverTypeId = local.typeId(receiverParameter.type)
            }
            else {
                builder.setReceiverType(local.type(receiverParameter.type))
            }' @ [257:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [257:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [258:17] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'receiverTypeId' @ [258:25] ==> public final var ProtoBuf.Function.Builder.receiverTypeId: Int[MyPropertyDescriptor]

'local' @ [258:42] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'typeId' @ [258:48] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [258:55] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'type' @ [258:73] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'builder' @ [261:17] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'setReceiverType' @ [261:25] ==> public open fun setReceiverType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function.Builder[JavaMethodDescriptor]

'local' @ [261:41] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'type' @ [261:47] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [261:52] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'type' @ [261:70] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [265:42] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'valueParameters' @ [265:53] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'builder' @ [266:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'addValueParameter' @ [266:21] ==> public open fun addValueParameter(p0: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?)): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function.Builder[JavaMethodDescriptor]

'local' @ [266:39] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'valueParameter' @ [266:45] ==> private final fun valueParameter(descriptor: ValueParameterDescriptor): ProtoBuf.ValueParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'valueParameterDescriptor' @ [266:60] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'serializeTypeTableToFunction' @ [269:13] ==> private final val serializeTypeTableToFunction: Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'typeTable' @ [270:34] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serialize' @ [270:44] ==> @Suppress public final fun serialize(): ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.MutableTypeTable[SimpleFunctionDescriptorImpl]

'typeTableProto' @ [271:17] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'builder' @ [272:17] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'typeTable' @ [272:25] ==> public final var ProtoBuf.Function.Builder.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'typeTableProto' @ [272:37] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'descriptor' @ [276:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'isSuspendOrHasSuspendTypesInSignature' @ [276:24] ==> private final fun CallableMemberDescriptor.isSuspendOrHasSuspendTypesInSignature(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [277:13] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'sinceKotlinInfo' @ [277:21] ==> public final var ProtoBuf.Function.Builder.sinceKotlinInfo: Int[MyPropertyDescriptor]

'writeSinceKotlinInfo' @ [277:39] ==> private final fun writeSinceKotlinInfo(languageFeature: LanguageFeature): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'Coroutines' @ [277:76] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'extension' @ [280:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeFunction' @ [280:19] ==> public open fun serializeFunction(descriptor: FunctionDescriptor, proto: ProtoBuf.Function.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [280:37] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[ValueParameterDescriptorImpl]

'builder' @ [280:49] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'builder' @ [282:16] ==> val builder: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.functionProto[LocalVariableDescriptor]

'newBuilder' @ [286:44] ==> public open fun newBuilder(): (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]

'createChildSerializer' @ [288:21] ==> private final fun createChildSerializer(descriptor: DeclarationDescriptor): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [288:43] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'getConstructorFlags' @ [290:27] ==> public open fun getConstructorFlags(p0: Boolean, @NotNull p1: Visibility, p2: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [290:47] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [290:62] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'descriptor' @ [290:75] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'visibility' @ [290:86] ==> public final val ConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'!' @ [290:98] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [290:99] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'isPrimary' @ [290:110] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'flags' @ [291:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'builder' @ [291:22] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'flags' @ [291:30] ==> public final var ProtoBuf.Constructor.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [292:13] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'flags' @ [292:21] ==> public final var ProtoBuf.Constructor.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [292:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'descriptor' @ [295:42] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'valueParameters' @ [295:53] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'builder' @ [296:13] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'addValueParameter' @ [296:21] ==> public open fun addValueParameter(p0: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?)): (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor.Builder[JavaMethodDescriptor]

'local' @ [296:39] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'valueParameter' @ [296:45] ==> private final fun valueParameter(descriptor: ValueParameterDescriptor): ProtoBuf.ValueParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'valueParameterDescriptor' @ [296:60] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'descriptor' @ [299:13] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'isSuspendOrHasSuspendTypesInSignature' @ [299:24] ==> private final fun CallableMemberDescriptor.isSuspendOrHasSuspendTypesInSignature(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [300:13] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'sinceKotlinInfo' @ [300:21] ==> public final var ProtoBuf.Constructor.Builder.sinceKotlinInfo: Int[MyPropertyDescriptor]

'writeSinceKotlinInfo' @ [300:39] ==> private final fun writeSinceKotlinInfo(languageFeature: LanguageFeature): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'Coroutines' @ [300:76] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'extension' @ [303:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeConstructor' @ [303:19] ==> public open fun serializeConstructor(descriptor: ConstructorDescriptor, proto: ProtoBuf.Constructor.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [303:40] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[ValueParameterDescriptorImpl]

'builder' @ [303:52] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'builder' @ [305:16] ==> val builder: (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.constructorProto[LocalVariableDescriptor]

'this' @ [309:13] ==> <this> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.isSuspendOrHasSuspendTypesInSignature[ReceiverParameterDescriptorImpl]

'isSuspend' @ [309:43] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'listOfNotNull' @ [311:16] ==> public fun <T : Any> listOfNotNull(vararg elements: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'extensionReceiverParameter' @ [312:17] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [312:45] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'returnType' @ [313:17] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'valueParameters' @ [314:18] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [314:34] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'getType' @ [314:64] ==> @NotNull public abstract fun getType(): KotlinType defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[JavaMethodDescriptor]

'toTypedArray' @ [314:73] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'any' @ [315:11] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'type' @ [315:25] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.isSuspendOrHasSuspendTypesInSignature.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [315:30] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'UnwrappedType' @ [315:39] ==> private constructor UnwrappedType() defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedClassConstructorDescriptor]

'isSuspendFunctionType' @ [315:54] ==> public val KotlinType.isSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'newBuilder' @ [319:42] ==> public open fun newBuilder(): (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias[JavaMethodDescriptor]

'createChildSerializer' @ [320:21] ==> private final fun createChildSerializer(descriptor: DeclarationDescriptor): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [320:43] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'getTypeAliasFlags' @ [322:27] ==> public open fun getTypeAliasFlags(p0: Boolean, p1: (Visibility..Visibility?)): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [322:45] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [322:60] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'descriptor' @ [322:73] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'visibility' @ [322:84] ==> public final val TypeAliasDescriptor.visibility: Visibility[MyPropertyDescriptor]

'flags' @ [323:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'builder' @ [323:22] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'flags' @ [323:30] ==> public final var ProtoBuf.TypeAlias.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [324:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'flags' @ [324:21] ==> public final var ProtoBuf.TypeAlias.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [324:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'builder' @ [327:9] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'name' @ [327:17] ==> public final var ProtoBuf.TypeAlias.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [327:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [327:43] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'name' @ [327:54] ==> public final val TypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [329:41] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [329:52] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'builder' @ [330:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'addTypeParameter' @ [330:21] ==> public open fun addTypeParameter(p0: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)): (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias.Builder[JavaMethodDescriptor]

'local' @ [330:38] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'typeParameter' @ [330:44] ==> private final fun typeParameter(typeParameter: TypeParameterDescriptor): ProtoBuf.TypeParameter.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [330:58] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'descriptor' @ [333:30] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'underlyingType' @ [333:41] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'if (useTypeTable()) {
            builder.underlyingTypeId = local.typeId(underlyingType)
        }
        else {
            builder.setUnderlyingType(local.type(underlyingType))
        }' @ [334:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [334:13] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [335:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'underlyingTypeId' @ [335:21] ==> public final var ProtoBuf.TypeAlias.Builder.underlyingTypeId: Int[MyPropertyDescriptor]

'local' @ [335:40] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'typeId' @ [335:46] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'underlyingType' @ [335:53] ==> val underlyingType: SimpleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'builder' @ [338:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'setUnderlyingType' @ [338:21] ==> public open fun setUnderlyingType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias.Builder[JavaMethodDescriptor]

'local' @ [338:39] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'type' @ [338:45] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'underlyingType' @ [338:50] ==> val underlyingType: SimpleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'descriptor' @ [341:28] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'expandedType' @ [341:39] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'if (useTypeTable()) {
            builder.expandedTypeId = local.typeId(expandedType)
        }
        else {
            builder.setExpandedType(local.type(expandedType))
        }' @ [342:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [342:13] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [343:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'expandedTypeId' @ [343:21] ==> public final var ProtoBuf.TypeAlias.Builder.expandedTypeId: Int[MyPropertyDescriptor]

'local' @ [343:38] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'typeId' @ [343:44] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'expandedType' @ [343:51] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'builder' @ [346:13] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'setExpandedType' @ [346:21] ==> public open fun setExpandedType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias.Builder[JavaMethodDescriptor]

'local' @ [346:37] ==> val local: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'type' @ [346:43] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'expandedType' @ [346:48] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'builder' @ [349:9] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'addAllAnnotation' @ [349:17] ==> public open fun addAllAnnotation(p0: (MutableIterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..Iterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)): (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias.Builder[JavaMethodDescriptor]

'descriptor' @ [349:34] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[ValueParameterDescriptorImpl]

'annotations' @ [349:45] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'map' @ [349:57] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> ProtoBuf.Annotation): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> Annotation

'extension' @ [349:63] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'annotationSerializer' @ [349:73] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.SerializerExtension[PropertyDescriptorImpl]

'serializeAnnotation' @ [349:94] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'it' @ [349:114] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [351:16] ==> val builder: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeAliasProto[LocalVariableDescriptor]

'newBuilder' @ [355:42] ==> public open fun newBuilder(): (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry[JavaMethodDescriptor]

'builder' @ [356:9] ==> val builder: (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.enumEntryProto[LocalVariableDescriptor]

'name' @ [356:17] ==> public final var ProtoBuf.EnumEntry.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [356:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [356:43] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.enumEntryProto[ValueParameterDescriptorImpl]

'name' @ [356:54] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'extension' @ [357:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeEnumEntry' @ [357:19] ==> public open fun serializeEnumEntry(descriptor: ClassDescriptor, proto: ProtoBuf.EnumEntry.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [357:38] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.enumEntryProto[ValueParameterDescriptorImpl]

'builder' @ [357:50] ==> val builder: (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.enumEntryProto[LocalVariableDescriptor]

'builder' @ [358:16] ==> val builder: (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.enumEntryProto[LocalVariableDescriptor]

'newBuilder' @ [362:47] ==> public open fun newBuilder(): (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]

'getValueParameterFlags' @ [364:27] ==> public open fun getValueParameterFlags(p0: Boolean, p1: Boolean, p2: Boolean, p3: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [365:17] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [365:32] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'descriptor' @ [365:45] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [365:56] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [366:17] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'isCrossinline' @ [366:28] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [366:43] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'isNoinline' @ [366:54] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'flags' @ [368:13] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'builder' @ [368:22] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'flags' @ [368:30] ==> public final var ProtoBuf.ValueParameter.Builder.flags: Int[MyPropertyDescriptor]

'builder' @ [369:13] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'flags' @ [369:21] ==> public final var ProtoBuf.ValueParameter.Builder.flags: Int[MyPropertyDescriptor]

'flags' @ [369:29] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'builder' @ [372:9] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'name' @ [372:17] ==> public final var ProtoBuf.ValueParameter.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [372:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [372:43] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'name' @ [372:54] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'if (useTypeTable()) {
            builder.typeId = typeId(descriptor.type)
        }
        else {
            builder.setType(type(descriptor.type))
        }' @ [374:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [374:13] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [375:13] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'typeId' @ [375:21] ==> public final var ProtoBuf.ValueParameter.Builder.typeId: Int[MyPropertyDescriptor]

'typeId' @ [375:30] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [375:37] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'type' @ [375:48] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'builder' @ [378:13] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'setType' @ [378:21] ==> public open fun setType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter.Builder[JavaMethodDescriptor]

'type' @ [378:29] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [378:34] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'type' @ [378:45] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [381:33] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'varargElementType' @ [381:44] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'varargElementType' @ [382:13] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.varargElementTypeId = typeId(varargElementType)
            }
            else {
                builder.setVarargElementType(type(varargElementType))
            }' @ [383:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [383:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [384:17] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'varargElementTypeId' @ [384:25] ==> public final var ProtoBuf.ValueParameter.Builder.varargElementTypeId: Int[MyPropertyDescriptor]

'typeId' @ [384:47] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'varargElementType' @ [384:54] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'builder' @ [387:17] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'setVarargElementType' @ [387:25] ==> public open fun setVarargElementType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter.Builder[JavaMethodDescriptor]

'type' @ [387:46] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'varargElementType' @ [387:51] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'extension' @ [391:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeValueParameter' @ [391:19] ==> public open fun serializeValueParameter(descriptor: ValueParameterDescriptor, proto: ProtoBuf.ValueParameter.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [391:43] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[ValueParameterDescriptorImpl]

'builder' @ [391:55] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'builder' @ [393:16] ==> val builder: (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.valueParameter[LocalVariableDescriptor]

'newBuilder' @ [397:46] ==> public open fun newBuilder(): (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter[JavaMethodDescriptor]

'builder' @ [399:9] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'id' @ [399:17] ==> public final var ProtoBuf.TypeParameter.Builder.id: Int[MyPropertyDescriptor]

'getTypeParameterId' @ [399:22] ==> private final fun getTypeParameterId(descriptor: TypeParameterDescriptor): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameter' @ [399:41] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'builder' @ [401:9] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'name' @ [401:17] ==> public final var ProtoBuf.TypeParameter.Builder.name: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [401:24] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeParameter' @ [401:43] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'name' @ [401:57] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'typeParameter' @ [403:13] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'isReified' @ [403:27] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'builder' @ [403:40] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'reified' @ [403:48] ==> public final var ProtoBuf.TypeParameter.Builder.reified: Boolean[MyPropertyDescriptor]

'builder' @ [404:13] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'reified' @ [404:21] ==> public final var ProtoBuf.TypeParameter.Builder.reified: Boolean[MyPropertyDescriptor]

'typeParameter' @ [404:31] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'isReified' @ [404:45] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'variance' @ [407:24] ==> private final fun variance(variance: Variance): ProtoBuf.TypeParameter.Variance defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'typeParameter' @ [407:33] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'variance' @ [407:47] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'variance' @ [408:13] ==> val variance: ProtoBuf.TypeParameter.Variance defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'builder' @ [408:25] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'variance' @ [408:33] ==> public final var ProtoBuf.TypeParameter.Builder.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'builder' @ [409:13] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'variance' @ [409:21] ==> public final var ProtoBuf.TypeParameter.Builder.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'variance' @ [409:32] ==> val variance: ProtoBuf.TypeParameter.Variance defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'extension' @ [411:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeTypeParameter' @ [411:19] ==> public open fun serializeTypeParameter(typeParameter: TypeParameterDescriptor, proto: ProtoBuf.TypeParameter.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'typeParameter' @ [411:42] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'builder' @ [411:57] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'typeParameter' @ [413:27] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[ValueParameterDescriptorImpl]

'upperBounds' @ [413:41] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'upperBounds' @ [414:13] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'size' @ [414:25] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'isDefaultBound' @ [414:53] ==> public open fun isDefaultBound(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'upperBounds' @ [414:68] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'single' @ [414:80] ==> public fun <T> List<(KotlinType..KotlinType?)>.single(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'builder' @ [414:98] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'upperBounds' @ [416:28] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.addUpperBoundId(typeId(upperBound))
            }
            else {
                builder.addUpperBound(type(upperBound))
            }' @ [417:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?), elseBranch: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)): (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Builder?)

'useTypeTable' @ [417:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [418:17] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'addUpperBoundId' @ [418:25] ==> public open fun addUpperBoundId(p0: Int): (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Builder[JavaMethodDescriptor]

'typeId' @ [418:41] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'upperBound' @ [418:48] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'builder' @ [421:17] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'addUpperBound' @ [421:25] ==> public open fun addUpperBound(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Builder[JavaMethodDescriptor]

'type' @ [421:39] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'upperBound' @ [421:44] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'builder' @ [425:16] ==> val builder: (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeParameter[LocalVariableDescriptor]

'typeTable' @ [428:49] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'type' @ [428:59] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'type' @ [428:64] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeId[ValueParameterDescriptorImpl]

'newBuilder' @ [431:37] ==> public open fun newBuilder(): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'type' @ [433:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'isError' @ [433:18] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'extension' @ [434:13] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeErrorType' @ [434:23] ==> public open fun serializeErrorType(type: KotlinType, builder: ProtoBuf.Type.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'type' @ [434:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'builder' @ [434:48] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'builder' @ [435:20] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [438:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'isFlexible' @ [438:18] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [439:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'asFlexibleType' @ [439:37] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [441:30] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'flexibleType' @ [441:35] ==> val flexibleType: FlexibleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'lowerBound' @ [441:48] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'type' @ [442:30] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'flexibleType' @ [442:35] ==> val flexibleType: FlexibleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'upperBound' @ [442:48] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'extension' @ [443:13] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeFlexibleType' @ [443:23] ==> public open fun serializeFlexibleType(flexibleType: FlexibleType, lowerProto: ProtoBuf.Type.Builder, upperProto: ProtoBuf.Type.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'flexibleType' @ [443:45] ==> val flexibleType: FlexibleType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'lowerBound' @ [443:59] ==> val lowerBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'upperBound' @ [443:71] ==> val upperBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'if (useTypeTable()) {
                lowerBound.flexibleUpperBoundId = typeTable[upperBound]
            }
            else {
                lowerBound.setFlexibleUpperBound(upperBound)
            }' @ [444:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [444:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'lowerBound' @ [445:17] ==> val lowerBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'flexibleUpperBoundId' @ [445:28] ==> public final var ProtoBuf.Type.Builder.flexibleUpperBoundId: Int[MyPropertyDescriptor]

'typeTable' @ [445:51] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'upperBound' @ [445:61] ==> val upperBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'lowerBound' @ [448:17] ==> val lowerBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'setFlexibleUpperBound' @ [448:28] ==> public open fun setFlexibleUpperBound(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'upperBound' @ [448:50] ==> val upperBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'lowerBound' @ [450:20] ==> val lowerBound: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [453:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'isSuspendFunctionType' @ [453:18] ==> public val KotlinType.isSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'type' @ [454:32] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'transformSuspendFunctionToRuntimeFunctionType' @ [454:37] ==> public fun transformSuspendFunctionToRuntimeFunctionType(suspendFunType: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'type' @ [454:83] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'functionType' @ [455:13] ==> val functionType: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'flags' @ [455:26] ==> public final var ProtoBuf.Type.Builder.flags: Int[MyPropertyDescriptor]

'getTypeFlags' @ [455:40] ==> public open fun getTypeFlags(p0: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'functionType' @ [456:20] ==> val functionType: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [459:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'constructor' @ [459:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [459:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (descriptor) {
            is ClassDescriptor, is TypeAliasDescriptor -> {
                val possiblyInnerType = type.buildPossiblyInnerType() ?: error("possiblyInnerType should not be null: $type")
                fillFromPossiblyInnerType(builder, possiblyInnerType)
            }
            is TypeParameterDescriptor -> {
                if (descriptor.containingDeclaration === containingDeclaration) {
                    builder.typeParameterName = getSimpleNameIndex(descriptor.name)
                }
                else {
                    builder.typeParameter = getTypeParameterId(descriptor)
                }

                assert(type.arguments.isEmpty()) { "Found arguments for type constructor build on type parameter: $descriptor" }
            }
        }' @ [460:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [460:15] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [462:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'buildPossiblyInnerType' @ [462:46] ==> public fun KotlinType.buildPossiblyInnerType(): PossiblyInnerType? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'error' @ [462:74] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [462:120] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'fillFromPossiblyInnerType' @ [463:17] ==> private final fun fillFromPossiblyInnerType(builder: ProtoBuf.Type.Builder, type: PossiblyInnerType): Unit defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [463:43] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'possiblyInnerType' @ [463:52] ==> val possiblyInnerType: PossiblyInnerType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'if (descriptor.containingDeclaration === containingDeclaration) {
                    builder.typeParameterName = getSimpleNameIndex(descriptor.name)
                }
                else {
                    builder.typeParameter = getTypeParameterId(descriptor)
                }' @ [466:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [466:21] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'containingDeclaration' @ [466:32] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [466:58] ==> private final val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'builder' @ [467:21] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'typeParameterName' @ [467:29] ==> public final var ProtoBuf.Type.Builder.typeParameterName: Int[MyPropertyDescriptor]

'getSimpleNameIndex' @ [467:49] ==> private final fun getSimpleNameIndex(name: Name): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [467:68] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'name' @ [467:79] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'builder' @ [470:21] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'typeParameter' @ [470:29] ==> public final var ProtoBuf.Type.Builder.typeParameter: Int[MyPropertyDescriptor]

'getTypeParameterId' @ [470:45] ==> private final fun getTypeParameterId(descriptor: TypeParameterDescriptor): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [470:64] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'assert' @ [473:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [473:24] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'arguments' @ [473:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [473:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [473:116] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [477:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [477:18] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'builder' @ [477:38] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'nullable' @ [477:46] ==> public final var ProtoBuf.Type.Builder.nullable: Boolean[MyPropertyDescriptor]

'builder' @ [478:13] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'nullable' @ [478:21] ==> public final var ProtoBuf.Type.Builder.nullable: Boolean[MyPropertyDescriptor]

'type' @ [478:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [478:37] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [481:28] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'getAbbreviatedType' @ [481:33] ==> public fun KotlinType.getAbbreviatedType(): AbbreviatedType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'abbreviation' @ [481:55] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'abbreviation' @ [482:13] ==> val abbreviation: SimpleType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.abbreviatedTypeId = typeId(abbreviation)
            }
            else {
                builder.setAbbreviatedType(type(abbreviation))
            }' @ [483:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [483:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [484:17] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'abbreviatedTypeId' @ [484:25] ==> public final var ProtoBuf.Type.Builder.abbreviatedTypeId: Int[MyPropertyDescriptor]

'typeId' @ [484:45] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'abbreviation' @ [484:52] ==> val abbreviation: SimpleType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'builder' @ [487:17] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'setAbbreviatedType' @ [487:25] ==> public open fun setAbbreviatedType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'type' @ [487:44] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'abbreviation' @ [487:49] ==> val abbreviation: SimpleType? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'extension' @ [491:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializeType' @ [491:19] ==> public open fun serializeType(type: KotlinType, proto: ProtoBuf.Type.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'type' @ [491:33] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[ValueParameterDescriptorImpl]

'builder' @ [491:39] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'builder' @ [493:16] ==> val builder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.type[LocalVariableDescriptor]

'type' @ [497:36] ==> value-parameter type: PossiblyInnerType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [497:41] ==> public final val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.descriptors.PossiblyInnerType[DeserializedPropertyDescriptor]

'getClassifierId' @ [498:28] ==> private final fun getClassifierId(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'classifierDescriptor' @ [498:44] ==> val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'when (classifierDescriptor) {
            is ClassDescriptor -> builder.className = classifierId
            is TypeAliasDescriptor -> builder.typeAliasName = classifierId
        }' @ [499:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'classifierDescriptor' @ [499:15] ==> val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'builder' @ [500:35] ==> value-parameter builder: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'className' @ [500:43] ==> public final var ProtoBuf.Type.Builder.className: Int[MyPropertyDescriptor]

'classifierId' @ [500:55] ==> val classifierId: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'builder' @ [501:39] ==> value-parameter builder: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'typeAliasName' @ [501:47] ==> public final var ProtoBuf.Type.Builder.typeAliasName: Int[MyPropertyDescriptor]

'classifierId' @ [501:63] ==> val classifierId: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'type' @ [504:28] ==> value-parameter type: PossiblyInnerType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'arguments' @ [504:33] ==> public final val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.descriptors.PossiblyInnerType[DeserializedPropertyDescriptor]

'builder' @ [505:13] ==> value-parameter builder: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'addArgument' @ [505:21] ==> public open fun addArgument(p0: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?)): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'typeArgument' @ [505:33] ==> private final fun typeArgument(typeProjection: TypeProjection): ProtoBuf.Type.Argument.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'projection' @ [505:46] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'type' @ [508:13] ==> value-parameter type: PossiblyInnerType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'outerType' @ [508:18] ==> public final val outerType: PossiblyInnerType? defined in org.jetbrains.kotlin.descriptors.PossiblyInnerType[DeserializedPropertyDescriptor]

'newBuilder' @ [509:46] ==> public open fun newBuilder(): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'fillFromPossiblyInnerType' @ [510:13] ==> private final fun fillFromPossiblyInnerType(builder: ProtoBuf.Type.Builder, type: PossiblyInnerType): Unit defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'outerBuilder' @ [510:39] ==> val outerBuilder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'type' @ [510:53] ==> value-parameter type: PossiblyInnerType defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'outerType' @ [510:58] ==> public final val outerType: PossiblyInnerType? defined in org.jetbrains.kotlin.descriptors.PossiblyInnerType[DeserializedPropertyDescriptor]

'if (useTypeTable()) {
                builder.outerTypeId = typeTable[outerBuilder]
            }
            else {
                builder.setOuterType(outerBuilder)
            }' @ [511:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [511:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [512:17] ==> value-parameter builder: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'outerTypeId' @ [512:25] ==> public final var ProtoBuf.Type.Builder.outerTypeId: Int[MyPropertyDescriptor]

'typeTable' @ [512:39] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'outerBuilder' @ [512:49] ==> val outerBuilder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'builder' @ [515:17] ==> value-parameter builder: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[ValueParameterDescriptorImpl]

'setOuterType' @ [515:25] ==> public open fun setOuterType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'outerBuilder' @ [515:38] ==> val outerBuilder: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.fillFromPossiblyInnerType[LocalVariableDescriptor]

'newBuilder' @ [521:46] ==> public open fun newBuilder(): (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument[JavaMethodDescriptor]

'if (typeProjection.isStarProjection) {
            builder.projection = ProtoBuf.Type.Argument.Projection.STAR
        }
        else {
            val projection = projection(typeProjection.projectionKind)

            if (projection != builder.projection) {
                builder.projection = projection
            }

            if (useTypeTable()) {
                builder.typeId = typeId(typeProjection.type)
            }
            else {
                builder.setType(type(typeProjection.type))
            }
        }' @ [523:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'typeProjection' @ [523:13] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[ValueParameterDescriptorImpl]

'isStarProjection' @ [523:28] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'builder' @ [524:13] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'projection' @ [524:21] ==> public final var ProtoBuf.Type.Argument.Builder.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'STAR' @ [524:68] ==> enum entry STAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'projection' @ [527:30] ==> private final fun projection(projectionKind: Variance): ProtoBuf.Type.Argument.Projection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'typeProjection' @ [527:41] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[ValueParameterDescriptorImpl]

'projectionKind' @ [527:56] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'projection' @ [529:17] ==> val projection: ProtoBuf.Type.Argument.Projection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'builder' @ [529:31] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'projection' @ [529:39] ==> public final var ProtoBuf.Type.Argument.Builder.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'builder' @ [530:17] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'projection' @ [530:25] ==> public final var ProtoBuf.Type.Argument.Builder.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'projection' @ [530:38] ==> val projection: ProtoBuf.Type.Argument.Projection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'if (useTypeTable()) {
                builder.typeId = typeId(typeProjection.type)
            }
            else {
                builder.setType(type(typeProjection.type))
            }' @ [533:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'useTypeTable' @ [533:17] ==> private final fun useTypeTable(): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'builder' @ [534:17] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'typeId' @ [534:25] ==> public final var ProtoBuf.Type.Argument.Builder.typeId: Int[MyPropertyDescriptor]

'typeId' @ [534:34] ==> private final fun typeId(type: KotlinType): Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeProjection' @ [534:41] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[ValueParameterDescriptorImpl]

'type' @ [534:56] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'builder' @ [537:17] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'setType' @ [537:25] ==> public open fun setType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Builder[JavaMethodDescriptor]

'type' @ [537:33] ==> private final fun type(type: KotlinType): ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'typeProjection' @ [537:38] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[ValueParameterDescriptorImpl]

'type' @ [537:53] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'builder' @ [541:16] ==> val builder: (ProtoBuf.Type.Argument.Builder..ProtoBuf.Type.Argument.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.typeArgument[LocalVariableDescriptor]

'newBuilder' @ [545:40] ==> public open fun newBuilder(): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'sort' @ [547:29] ==> public final fun <T : DeclarationDescriptor> sort(descriptors: Collection<DeclarationDescriptor>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DeclarationDescriptor> -> DeclarationDescriptor

'members' @ [547:34] ==> value-parameter members: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[ValueParameterDescriptorImpl]

'when (declaration) {
                is PropertyDescriptor -> builder.addProperty(propertyProto(declaration))
                is FunctionDescriptor -> builder.addFunction(functionProto(declaration))
                is TypeAliasDescriptor -> builder.addTypeAlias(typeAliasProto(declaration))
            }' @ [548:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?), entry1: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?), entry2: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?)): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder?)

'declaration' @ [548:19] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [549:42] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'addProperty' @ [549:50] ==> public open fun addProperty(p0: (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?)): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'propertyProto' @ [549:62] ==> public final fun propertyProto(descriptor: PropertyDescriptor): ProtoBuf.Property.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'declaration' @ [549:76] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [550:42] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'addFunction' @ [550:50] ==> public open fun addFunction(p0: (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?)): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'functionProto' @ [550:62] ==> public final fun functionProto(descriptor: FunctionDescriptor): ProtoBuf.Function.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'declaration' @ [550:76] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [551:43] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'addTypeAlias' @ [551:51] ==> public open fun addTypeAlias(p0: (ProtoBuf.TypeAlias.Builder..ProtoBuf.TypeAlias.Builder?)): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'typeAliasProto' @ [551:64] ==> public final fun typeAliasProto(descriptor: TypeAliasDescriptor): ProtoBuf.TypeAlias.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[SimpleFunctionDescriptorImpl]

'declaration' @ [551:79] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'typeTable' @ [555:30] ==> private final val typeTable: MutableTypeTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serialize' @ [555:40] ==> @Suppress public final fun serialize(): ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.MutableTypeTable[SimpleFunctionDescriptorImpl]

'typeTableProto' @ [556:13] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [557:13] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'typeTable' @ [557:21] ==> public final var ProtoBuf.Package.Builder.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'typeTableProto' @ [557:33] ==> val typeTableProto: ProtoBuf.TypeTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'sinceKotlinInfoTable' @ [560:36] ==> private final val sinceKotlinInfoTable: MutableSinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serialize' @ [560:57] ==> @Suppress public final fun serialize(): ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable[SimpleFunctionDescriptorImpl]

'sinceKotlinInfoProto' @ [561:13] ==> val sinceKotlinInfoProto: ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [562:13] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'sinceKotlinInfoTable' @ [562:21] ==> public final var ProtoBuf.Package.Builder.sinceKotlinInfoTable: (ProtoBuf.SinceKotlinInfoTable..ProtoBuf.SinceKotlinInfoTable?)[MyPropertyDescriptor]

'sinceKotlinInfoProto' @ [562:44] ==> val sinceKotlinInfoProto: ProtoBuf.SinceKotlinInfoTable? defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'extension' @ [565:9] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'serializePackage' @ [565:19] ==> public open fun serializePackage(packageFqName: FqName, proto: ProtoBuf.Package.Builder): Unit defined in org.jetbrains.kotlin.serialization.SerializerExtension[SimpleFunctionDescriptorImpl]

'packageFqName' @ [565:36] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[ValueParameterDescriptorImpl]

'builder' @ [565:51] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'builder' @ [567:16] ==> val builder: (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.packagePartProto[LocalVariableDescriptor]

'languageFeature' @ [571:31] ==> value-parameter languageFeature: LanguageFeature defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo[ValueParameterDescriptorImpl]

'sinceVersion' @ [571:47] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'newBuilder' @ [572:56] ==> public open fun newBuilder(): (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo[JavaMethodDescriptor]

'apply' @ [572:69] ==> @InlineOnly public inline fun <T> (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?).apply(block: (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?).() -> Unit): (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo.Builder..org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo.Builder?)

'SinceKotlinInfo' @ [573:13] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[FakeCallableDescriptorForObject]

'Version' @ [573:29] ==> public constructor Version(major: Int, minor: Int, patch: Int = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[DeserializedClassConstructorDescriptor]

'languageVersion' @ [573:37] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo[LocalVariableDescriptor]

'major' @ [573:53] ==> public final val major: Int defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'languageVersion' @ [573:60] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo[LocalVariableDescriptor]

'minor' @ [573:76] ==> public final val minor: Int defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'encode' @ [573:83] ==> public final fun encode(writeVersion: (Int) -> Unit, writeVersionFull: (Int) -> Unit): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[DeserializedSimpleFunctionDescriptor]

'version' @ [574:38] ==> public final var ProtoBuf.SinceKotlinInfo.Builder.version: Int[MyPropertyDescriptor]

'it' @ [574:48] ==> value-parameter it: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'versionFull' @ [575:42] ==> public final var ProtoBuf.SinceKotlinInfo.Builder.versionFull: Int[MyPropertyDescriptor]

'it' @ [575:56] ==> value-parameter it: Int defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sinceKotlinInfoTable' @ [578:16] ==> private final val sinceKotlinInfoTable: MutableSinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'sinceKotlinInfo' @ [578:37] ==> val sinceKotlinInfo: (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.writeSinceKotlinInfo[LocalVariableDescriptor]

'stringTable' @ [582:13] ==> public final val stringTable: StringTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'getFqNameIndex' @ [582:25] ==> public abstract fun getFqNameIndex(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.StringTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [582:40] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.getClassifierId[ValueParameterDescriptorImpl]

'stringTable' @ [585:13] ==> public final val stringTable: StringTable defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'getStringIndex' @ [585:25] ==> public abstract fun getStringIndex(string: String): Int defined in org.jetbrains.kotlin.serialization.StringTable[SimpleFunctionDescriptorImpl]

'name' @ [585:40] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.getSimpleNameIndex[ValueParameterDescriptorImpl]

'asString' @ [585:45] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'typeParameters' @ [588:13] ==> private final val typeParameters: Interner<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'intern' @ [588:28] ==> public open fun intern(@NotNull p0: TypeParameterDescriptor): Int defined in org.jetbrains.kotlin.utils.Interner[JavaMethodDescriptor]

'descriptor' @ [588:35] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.getTypeParameterId[ValueParameterDescriptorImpl]

'JvmStatic' @ [591:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DescriptorSerializer' @ [593:20] ==> private constructor DescriptorSerializer(containingDeclaration: DeclarationDescriptor?, typeParameters: Interner<TypeParameterDescriptor>, extension: SerializerExtension, typeTable: MutableTypeTable, sinceKotlinInfoTable: MutableSinceKotlinInfoTable, serializeTypeTableToFunction: Boolean) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[ClassConstructorDescriptorImpl]

'Interner' @ [593:47] ==> public constructor Interner<T : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.Interner[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeParameterDescriptor

'extension' @ [593:59] ==> value-parameter extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.createTopLevel[ValueParameterDescriptorImpl]

'MutableTypeTable' @ [593:70] ==> public constructor MutableTypeTable() defined in org.jetbrains.kotlin.serialization.MutableTypeTable[ClassConstructorDescriptorImpl]

'MutableSinceKotlinInfoTable' @ [593:90] ==> public constructor MutableSinceKotlinInfoTable() defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable[ClassConstructorDescriptorImpl]

'JvmStatic' @ [597:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DescriptorSerializer' @ [599:20] ==> private constructor DescriptorSerializer(containingDeclaration: DeclarationDescriptor?, typeParameters: Interner<TypeParameterDescriptor>, extension: SerializerExtension, typeTable: MutableTypeTable, sinceKotlinInfoTable: MutableSinceKotlinInfoTable, serializeTypeTableToFunction: Boolean) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[ClassConstructorDescriptorImpl]

'Interner' @ [599:47] ==> public constructor Interner<T : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.Interner[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeParameterDescriptor

'extension' @ [599:59] ==> value-parameter extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.createForLambda[ValueParameterDescriptorImpl]

'MutableTypeTable' @ [599:70] ==> public constructor MutableTypeTable() defined in org.jetbrains.kotlin.serialization.MutableTypeTable[ClassConstructorDescriptorImpl]

'MutableSinceKotlinInfoTable' @ [599:90] ==> public constructor MutableSinceKotlinInfoTable() defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable[ClassConstructorDescriptorImpl]

'JvmStatic' @ [603:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'descriptor' @ [605:29] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[ValueParameterDescriptorImpl]

'containingDeclaration' @ [605:40] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (container is ClassDescriptor)
                create(container, extension)
            else
                createTopLevel(extension)' @ [606:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorSerializer, elseBranch: DescriptorSerializer): DescriptorSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorSerializer

'container' @ [606:40] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'create' @ [607:17] ==> @JvmStatic public final fun create(descriptor: ClassDescriptor, extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'container' @ [607:24] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'extension' @ [607:35] ==> value-parameter extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[ValueParameterDescriptorImpl]

'createTopLevel' @ [609:17] ==> @JvmStatic public final fun createTopLevel(extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'extension' @ [609:32] ==> value-parameter extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[ValueParameterDescriptorImpl]

'DescriptorSerializer' @ [614:30] ==> private constructor DescriptorSerializer(containingDeclaration: DeclarationDescriptor?, typeParameters: Interner<TypeParameterDescriptor>, extension: SerializerExtension, typeTable: MutableTypeTable, sinceKotlinInfoTable: MutableSinceKotlinInfoTable, serializeTypeTableToFunction: Boolean) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[ClassConstructorDescriptorImpl]

'descriptor' @ [615:21] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[ValueParameterDescriptorImpl]

'Interner' @ [616:21] ==> public constructor Interner<T : (Any..Any?)>(p0: (Interner<(TypeParameterDescriptor..TypeParameterDescriptor?)>..Interner<(TypeParameterDescriptor..TypeParameterDescriptor?)>?)) defined in org.jetbrains.kotlin.utils.Interner[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'parentSerializer' @ [616:30] ==> val parentSerializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'typeParameters' @ [616:47] ==> private final val typeParameters: Interner<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'parentSerializer' @ [617:21] ==> val parentSerializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'extension' @ [617:38] ==> private final val extension: SerializerExtension defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'MutableTypeTable' @ [618:21] ==> public constructor MutableTypeTable() defined in org.jetbrains.kotlin.serialization.MutableTypeTable[ClassConstructorDescriptorImpl]

'MutableSinceKotlinInfoTable' @ [619:21] ==> public constructor MutableSinceKotlinInfoTable() defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable[ClassConstructorDescriptorImpl]

'descriptor' @ [622:35] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [622:46] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'serializer' @ [623:17] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'typeParameters' @ [623:28] ==> private final val typeParameters: Interner<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[PropertyDescriptorImpl]

'intern' @ [623:43] ==> public open fun intern(@NotNull p0: TypeParameterDescriptor): Int defined in org.jetbrains.kotlin.utils.Interner[JavaMethodDescriptor]

'typeParameter' @ [623:50] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'serializer' @ [625:20] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.create[LocalVariableDescriptor]

'getAccessorFlags' @ [629:26] ==> public open fun getAccessorFlags(p0: Boolean, @NotNull p1: Visibility, @NotNull p2: Modality, p3: Boolean, p4: Boolean, p5: Boolean): Int defined in org.jetbrains.kotlin.serialization.Flags[JavaMethodDescriptor]

'hasAnnotations' @ [630:21] ==> private final fun hasAnnotations(descriptor: Annotated): Boolean defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[SimpleFunctionDescriptorImpl]

'accessor' @ [630:36] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'accessor' @ [631:21] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'visibility' @ [631:30] ==> public final val PropertyAccessorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'accessor' @ [632:21] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'modality' @ [632:30] ==> public final val PropertyAccessorDescriptor.modality: Modality[MyPropertyDescriptor]

'!' @ [633:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'accessor' @ [633:22] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'isDefault' @ [633:31] ==> public final val PropertyAccessorDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'accessor' @ [634:21] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'isExternal' @ [634:30] ==> public final val PropertyAccessorDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'accessor' @ [635:21] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.getAccessorFlags[ValueParameterDescriptorImpl]

'isInline' @ [635:30] ==> public final val PropertyAccessorDescriptor.isInline: Boolean[MyPropertyDescriptor]

'when (variance) {
            Variance.INVARIANT -> ProtoBuf.TypeParameter.Variance.INV
            Variance.IN_VARIANCE -> ProtoBuf.TypeParameter.Variance.IN
            Variance.OUT_VARIANCE -> ProtoBuf.TypeParameter.Variance.OUT
        }' @ [639:85] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.TypeParameter.Variance, entry1: ProtoBuf.TypeParameter.Variance, entry2: ProtoBuf.TypeParameter.Variance): ProtoBuf.TypeParameter.Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'variance' @ [639:91] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.variance[ValueParameterDescriptorImpl]

'INVARIANT' @ [640:22] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INV' @ [640:67] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [641:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN' @ [641:69] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [642:22] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [642:70] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'when (projectionKind) {
            Variance.INVARIANT -> ProtoBuf.Type.Argument.Projection.INV
            Variance.IN_VARIANCE -> ProtoBuf.Type.Argument.Projection.IN
            Variance.OUT_VARIANCE -> ProtoBuf.Type.Argument.Projection.OUT
        }' @ [645:95] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type.Argument.Projection, entry1: ProtoBuf.Type.Argument.Projection, entry2: ProtoBuf.Type.Argument.Projection): ProtoBuf.Type.Argument.Projection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Projection

'projectionKind' @ [645:101] ==> value-parameter projectionKind: Variance defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.projection[ValueParameterDescriptorImpl]

'INVARIANT' @ [646:22] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INV' @ [646:69] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [647:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN' @ [647:71] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [648:22] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [648:72] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'!' @ [651:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [651:71] ==> value-parameter descriptor: Annotated defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.hasAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [651:82] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[DeserializedPropertyDescriptor]

'isEmpty' @ [651:94] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [654:17] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (T..T?)>..Collection<(T..T?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (T..T?)

'descriptors' @ [654:27] ==> value-parameter descriptors: Collection<T> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.sort[ValueParameterDescriptorImpl]

'apply' @ [654:40] ==> @InlineOnly public inline fun <T> ArrayList<(T..T?)>.apply(block: ArrayList<(T..T?)>.() -> Unit): ArrayList<(T..T?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<(T..T?)>

'sort' @ [656:33] ==> public open fun <T : (Any..Any?)> sort(p0: (MutableList<(T..T?)>..List<(T..T?)>?), p1: (Comparator<in (T..T?)>..Comparator<in (T..T?)>?)): Unit defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'this' @ [656:38] ==> <this> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion.sort.<anonymous>[ReceiverParameterDescriptorImpl]

'INSTANCE' @ [656:61] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

