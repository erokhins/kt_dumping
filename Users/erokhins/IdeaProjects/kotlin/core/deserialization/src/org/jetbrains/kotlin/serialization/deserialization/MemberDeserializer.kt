'AnnotationDeserializer' @ [34:42] ==> public constructor AnnotationDeserializer(module: ModuleDescriptor, notFoundClasses: NotFoundClasses) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[ClassConstructorDescriptorImpl]

'c' @ [34:65] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [34:67] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'moduleDescriptor' @ [34:78] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'c' @ [34:96] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [34:98] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'notFoundClasses' @ [34:109] ==> public final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'if (proto.hasFlags()) proto.flags else loadOldFlags(proto.oldFlags)' @ [36:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [36:25] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasFlags' @ [36:31] ==> public open fun hasFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'proto' @ [36:43] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'flags' @ [36:49] ==> public final val ProtoBuf.Property.flags: Int[MyPropertyDescriptor]

'loadOldFlags' @ [36:60] ==> private final fun loadOldFlags(oldFlags: Int): Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [36:73] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'oldFlags' @ [36:79] ==> public final val ProtoBuf.Property.oldFlags: Int[MyPropertyDescriptor]

'DeserializedPropertyDescriptor' @ [38:24] ==> public constructor DeserializedPropertyDescriptor(containingDeclaration: DeclarationDescriptor, original: PropertyDescriptor?, annotations: Annotations, modality: Modality, visibility: Visibility, isVar: Boolean, name: Name, kind: CallableMemberDescriptor.Kind, isLateInit: Boolean, isConst: Boolean, isExternal: Boolean, isDelegated: Boolean, isHeader: Boolean, proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor[ClassConstructorDescriptorImpl]

'c' @ [39:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [39:19] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getAnnotations' @ [40:17] ==> private final fun getAnnotations(proto: MessageLite, flags: Int, kind: AnnotatedCallableKind): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [40:32] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'flags' @ [40:39] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'PROPERTY' @ [40:68] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Deserialization' @ [41:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'modality' @ [41:33] ==> @JvmStatic public final fun modality(modality: ProtoBuf.Modality?): Modality defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MODALITY' @ [41:48] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [41:57] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [41:61] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'Deserialization' @ [42:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [42:33] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [42:50] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [42:61] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [42:65] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_VAR' @ [43:23] ==> public final val IS_VAR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [43:30] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [43:34] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'c' @ [44:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [44:19] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [44:32] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [44:40] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'name' @ [44:46] ==> public final val ProtoBuf.Property.name: Int[MyPropertyDescriptor]

'Deserialization' @ [45:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'memberKind' @ [45:33] ==> @JvmStatic public final fun memberKind(memberKind: ProtoBuf.MemberKind?): CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MEMBER_KIND' @ [45:50] ==> public final val MEMBER_KIND: (Flags.FlagField<(ProtoBuf.MemberKind..ProtoBuf.MemberKind?)>..Flags.FlagField<(ProtoBuf.MemberKind..ProtoBuf.MemberKind?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [45:62] ==> public abstract operator fun get(flags: Int): (ProtoBuf.MemberKind..ProtoBuf.MemberKind?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [45:66] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_LATEINIT' @ [46:23] ==> public final val IS_LATEINIT: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [46:35] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [46:39] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_CONST' @ [47:23] ==> public final val IS_CONST: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [47:32] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [47:36] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_EXTERNAL_PROPERTY' @ [48:23] ==> public final val IS_EXTERNAL_PROPERTY: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [48:44] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [48:48] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_DELEGATED' @ [49:23] ==> public final val IS_DELEGATED: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [49:36] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [49:40] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'IS_HEADER_PROPERTY' @ [50:23] ==> public final val IS_HEADER_PROPERTY: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [50:42] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [50:46] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [51:17] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'c' @ [52:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [52:19] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [53:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [53:19] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [54:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'sinceKotlinInfoTable' @ [54:19] ==> public final val sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [55:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containerSource' @ [55:19] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [58:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'childContext' @ [58:23] ==> public final fun childContext(descriptor: DeclarationDescriptor, typeParameterProtos: List<ProtoBuf.TypeParameter>, nameResolver: NameResolver = ..., typeTable: TypeTable = ...): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[SimpleFunctionDescriptorImpl]

'property' @ [58:36] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [58:46] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'typeParameterList' @ [58:52] ==> public final val ProtoBuf.Property.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'HAS_GETTER' @ [60:31] ==> public final val HAS_GETTER: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [60:42] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [60:46] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'if (hasGetter && proto.hasReceiver())
            getReceiverParameterAnnotations(proto, AnnotatedCallableKind.PROPERTY_GETTER)
        else
            Annotations.EMPTY' @ [61:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Annotations, elseBranch: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Annotations

'hasGetter' @ [61:39] ==> val hasGetter: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [61:52] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasReceiver' @ [61:58] ==> public fun ProtoBuf.Property.hasReceiver(): Boolean defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'getReceiverParameterAnnotations' @ [62:13] ==> private final fun getReceiverParameterAnnotations(proto: MessageLite, kind: AnnotatedCallableKind, receiverTargetedKind: AnnotatedCallableKind = ...): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [62:45] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'PROPERTY_GETTER' @ [62:74] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Annotations' @ [64:13] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [64:25] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'property' @ [66:9] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'setType' @ [66:18] ==> public open fun setType(@NotNull outType: KotlinType, @ReadOnly @NotNull typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @Nullable receiverType: KotlinType?): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor[JavaMethodDescriptor]

'local' @ [67:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'typeDeserializer' @ [67:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [67:40] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [67:45] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'returnType' @ [67:51] ==> public fun ProtoBuf.Property.returnType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [67:62] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [67:64] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'local' @ [68:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'typeDeserializer' @ [68:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'ownTypeParameters' @ [68:40] ==> public final val ownTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'getDispatchReceiverParameter' @ [69:17] ==> private final fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [70:17] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'receiverType' @ [70:23] ==> public fun ProtoBuf.Property.receiverType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [70:36] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [70:38] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'let' @ [70:50] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Type.let(block: (ProtoBuf.Type) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> KotlinType

'local' @ [70:56] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'typeDeserializer' @ [70:62] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [70:79] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [70:84] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty.<anonymous>[ValueParameterDescriptorImpl]

'receiverAnnotations' @ [70:88] ==> val receiverAnnotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'if (hasGetter) {
            val getterFlags = proto.getterFlags
            val isNotDefault = proto.hasGetterFlags() && Flags.IS_NOT_DEFAULT.get(getterFlags)
            val isExternal = proto.hasGetterFlags() && Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)
            val isInline = proto.hasGetterFlags() && Flags.IS_INLINE_ACCESSOR.get(getterFlags)
            val getter = if (isNotDefault) {
                PropertyGetterDescriptorImpl(
                        property,
                        getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER),
                        Deserialization.modality(Flags.MODALITY.get(getterFlags)),
                        Deserialization.visibility(Flags.VISIBILITY.get(getterFlags)),
                        /* isDefault = */ !isNotDefault,
                        /* isExternal = */ isExternal,
                        isInline,
                        property.kind, null, SourceElement.NO_SOURCE
                )
            }
            else {
                DescriptorFactory.createDefaultGetter(property, Annotations.EMPTY)
            }
            getter.initialize(property.returnType)
            getter
        }
        else {
            null
        }' @ [73:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyGetterDescriptorImpl?, elseBranch: PropertyGetterDescriptorImpl?): PropertyGetterDescriptorImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyGetterDescriptorImpl?

'hasGetter' @ [73:26] ==> val hasGetter: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [74:31] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'getterFlags' @ [74:37] ==> public final val ProtoBuf.Property.getterFlags: Int[MyPropertyDescriptor]

'proto' @ [75:32] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [75:38] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_NOT_DEFAULT' @ [75:64] ==> public final val IS_NOT_DEFAULT: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [75:79] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'getterFlags' @ [75:83] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [76:30] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [76:36] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_EXTERNAL_ACCESSOR' @ [76:62] ==> public final val IS_EXTERNAL_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [76:83] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'getterFlags' @ [76:87] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [77:28] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [77:34] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [77:60] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [77:79] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'getterFlags' @ [77:83] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'if (isNotDefault) {
                PropertyGetterDescriptorImpl(
                        property,
                        getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER),
                        Deserialization.modality(Flags.MODALITY.get(getterFlags)),
                        Deserialization.visibility(Flags.VISIBILITY.get(getterFlags)),
                        /* isDefault = */ !isNotDefault,
                        /* isExternal = */ isExternal,
                        isInline,
                        property.kind, null, SourceElement.NO_SOURCE
                )
            }
            else {
                DescriptorFactory.createDefaultGetter(property, Annotations.EMPTY)
            }' @ [78:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyGetterDescriptorImpl, elseBranch: PropertyGetterDescriptorImpl): PropertyGetterDescriptorImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyGetterDescriptorImpl

'isNotDefault' @ [78:30] ==> val isNotDefault: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'PropertyGetterDescriptorImpl' @ [79:17] ==> public constructor PropertyGetterDescriptorImpl(@NotNull correspondingProperty: PropertyDescriptor, @NotNull annotations: Annotations, @NotNull modality: Modality, @NotNull visibility: Visibility, isDefault: Boolean, isExternal: Boolean, isInline: Boolean, @NotNull kind: CallableMemberDescriptor.Kind, @Nullable original: PropertyGetterDescriptor?, @NotNull source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaClassConstructorDescriptor]

'property' @ [80:25] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'getAnnotations' @ [81:25] ==> private final fun getAnnotations(proto: MessageLite, flags: Int, kind: AnnotatedCallableKind): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [81:40] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'getterFlags' @ [81:47] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'PROPERTY_GETTER' @ [81:82] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Deserialization' @ [82:25] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'modality' @ [82:41] ==> @JvmStatic public final fun modality(modality: ProtoBuf.Modality?): Modality defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MODALITY' @ [82:56] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [82:65] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'getterFlags' @ [82:69] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'Deserialization' @ [83:25] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [83:41] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [83:58] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [83:69] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'getterFlags' @ [83:73] ==> val getterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'!' @ [84:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNotDefault' @ [84:44] ==> val isNotDefault: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'isExternal' @ [85:44] ==> val isExternal: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'isInline' @ [86:25] ==> val isInline: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'property' @ [87:25] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'kind' @ [87:34] ==> public final val DeserializedPropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'NO_SOURCE' @ [87:60] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'createDefaultGetter' @ [91:35] ==> @NotNull public open fun createDefaultGetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'property' @ [91:55] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'Annotations' @ [91:65] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [91:77] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'getter' @ [93:13] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'initialize' @ [93:20] ==> public open fun initialize(returnType: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'property' @ [93:31] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'returnType' @ [93:40] ==> public final val DeserializedPropertyDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'getter' @ [94:13] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'if (Flags.HAS_SETTER.get(flags)) {
            val setterFlags = proto.setterFlags
            val isNotDefault = proto.hasSetterFlags() && Flags.IS_NOT_DEFAULT.get(setterFlags)
            val isExternal = proto.hasSetterFlags() && Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)
            val isInline = proto.hasGetterFlags() && Flags.IS_INLINE_ACCESSOR.get(setterFlags)
            if (isNotDefault) {
                val setter = PropertySetterDescriptorImpl(
                        property,
                        getAnnotations(proto, setterFlags, AnnotatedCallableKind.PROPERTY_SETTER),
                        Deserialization.modality(Flags.MODALITY.get(setterFlags)),
                        Deserialization.visibility(Flags.VISIBILITY.get(setterFlags)),
                        /* isDefault = */ !isNotDefault,
                        /* isExternal = */ isExternal,
                        isInline,
                        property.kind, null, SourceElement.NO_SOURCE
                )
                val setterLocal = local.childContext(setter, listOf())
                val valueParameters = setterLocal.memberDeserializer.valueParameters(
                        listOf(proto.setterValueParameter), proto, AnnotatedCallableKind.PROPERTY_SETTER
                )
                setter.initialize(valueParameters.single())
                setter
            }
            else {
                DescriptorFactory.createDefaultSetter(property, Annotations.EMPTY)
            }
        }
        else {
            null
        }' @ [100:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertySetterDescriptorImpl?, elseBranch: PropertySetterDescriptorImpl?): PropertySetterDescriptorImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertySetterDescriptorImpl?

'HAS_SETTER' @ [100:32] ==> public final val HAS_SETTER: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [100:43] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [100:47] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [101:31] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'setterFlags' @ [101:37] ==> public final val ProtoBuf.Property.setterFlags: Int[MyPropertyDescriptor]

'proto' @ [102:32] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasSetterFlags' @ [102:38] ==> public open fun hasSetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_NOT_DEFAULT' @ [102:64] ==> public final val IS_NOT_DEFAULT: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [102:79] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'setterFlags' @ [102:83] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [103:30] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasSetterFlags' @ [103:36] ==> public open fun hasSetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_EXTERNAL_ACCESSOR' @ [103:62] ==> public final val IS_EXTERNAL_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [103:83] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'setterFlags' @ [103:87] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'proto' @ [104:28] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [104:34] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [104:60] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [104:79] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'setterFlags' @ [104:83] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'if (isNotDefault) {
                val setter = PropertySetterDescriptorImpl(
                        property,
                        getAnnotations(proto, setterFlags, AnnotatedCallableKind.PROPERTY_SETTER),
                        Deserialization.modality(Flags.MODALITY.get(setterFlags)),
                        Deserialization.visibility(Flags.VISIBILITY.get(setterFlags)),
                        /* isDefault = */ !isNotDefault,
                        /* isExternal = */ isExternal,
                        isInline,
                        property.kind, null, SourceElement.NO_SOURCE
                )
                val setterLocal = local.childContext(setter, listOf())
                val valueParameters = setterLocal.memberDeserializer.valueParameters(
                        listOf(proto.setterValueParameter), proto, AnnotatedCallableKind.PROPERTY_SETTER
                )
                setter.initialize(valueParameters.single())
                setter
            }
            else {
                DescriptorFactory.createDefaultSetter(property, Annotations.EMPTY)
            }' @ [105:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertySetterDescriptorImpl, elseBranch: PropertySetterDescriptorImpl): PropertySetterDescriptorImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertySetterDescriptorImpl

'isNotDefault' @ [105:17] ==> val isNotDefault: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'PropertySetterDescriptorImpl' @ [106:30] ==> public constructor PropertySetterDescriptorImpl(@NotNull correspondingProperty: PropertyDescriptor, @NotNull annotations: Annotations, @NotNull modality: Modality, @NotNull visibility: Visibility, isDefault: Boolean, isExternal: Boolean, isInline: Boolean, @NotNull kind: CallableMemberDescriptor.Kind, @Nullable original: PropertySetterDescriptor?, @NotNull source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaClassConstructorDescriptor]

'property' @ [107:25] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'getAnnotations' @ [108:25] ==> private final fun getAnnotations(proto: MessageLite, flags: Int, kind: AnnotatedCallableKind): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [108:40] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'setterFlags' @ [108:47] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'PROPERTY_SETTER' @ [108:82] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Deserialization' @ [109:25] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'modality' @ [109:41] ==> @JvmStatic public final fun modality(modality: ProtoBuf.Modality?): Modality defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MODALITY' @ [109:56] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [109:65] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'setterFlags' @ [109:69] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'Deserialization' @ [110:25] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [110:41] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [110:58] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [110:69] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'setterFlags' @ [110:73] ==> val setterFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'!' @ [111:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNotDefault' @ [111:44] ==> val isNotDefault: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'isExternal' @ [112:44] ==> val isExternal: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'isInline' @ [113:25] ==> val isInline: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'property' @ [114:25] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'kind' @ [114:34] ==> public final val DeserializedPropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'NO_SOURCE' @ [114:60] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'local' @ [116:35] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'childContext' @ [116:41] ==> public final fun childContext(descriptor: DeclarationDescriptor, typeParameterProtos: List<ProtoBuf.TypeParameter>, nameResolver: NameResolver = ..., typeTable: TypeTable = ...): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[SimpleFunctionDescriptorImpl]

'setter' @ [116:54] ==> val setter: PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'listOf' @ [116:62] ==> @InlineOnly public inline fun <T> listOf(): List<ProtoBuf.TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'setterLocal' @ [117:39] ==> val setterLocal: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'memberDeserializer' @ [117:51] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'valueParameters' @ [117:70] ==> private final fun valueParameters(valueParameters: List<ProtoBuf.ValueParameter>, callable: MessageLite, kind: AnnotatedCallableKind): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'listOf' @ [118:25] ==> public fun <T> listOf(element: (ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)): List<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter..org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter?)

'proto' @ [118:32] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'setterValueParameter' @ [118:38] ==> public final val ProtoBuf.Property.setterValueParameter: (ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)[MyPropertyDescriptor]

'proto' @ [118:61] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'PROPERTY_SETTER' @ [118:90] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'setter' @ [120:17] ==> val setter: PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'initialize' @ [120:24] ==> public open fun initialize(@NotNull parameter: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaMethodDescriptor]

'valueParameters' @ [120:35] ==> val valueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'single' @ [120:51] ==> public fun <T> List<ValueParameterDescriptor>.single(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'setter' @ [121:17] ==> val setter: PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'createDefaultSetter' @ [124:35] ==> @NotNull public open fun createDefaultSetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations): PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'property' @ [124:55] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'Annotations' @ [124:65] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [124:77] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'HAS_CONSTANT' @ [131:19] ==> public final val HAS_CONSTANT: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [131:32] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [131:36] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'property' @ [132:13] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'setCompileTimeInitializer' @ [132:22] ==> public open fun setCompileTimeInitializer(@NotNull compileTimeInitializer: NullableLazyValue<(ConstantValue<*>..ConstantValue<*>?)>): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor[JavaMethodDescriptor]

'c' @ [133:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'storageManager' @ [133:23] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createNullableLazyValue' @ [133:38] ==> public abstract fun <T : Any> createNullableLazyValue(computable: () -> ConstantValue<Any?>?): NullableLazyValue<ConstantValue<Any?>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ConstantValue<Any?>

'c' @ [134:41] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [134:43] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'asProtoContainer' @ [134:65] ==> private final fun DeclarationDescriptor.asProtoContainer(): ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'c' @ [135:25] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [135:27] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [135:38] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadPropertyConstant' @ [135:66] ==> public abstract fun loadPropertyConstant(container: ProtoContainer, proto: ProtoBuf.Property, expectedType: KotlinType): ConstantValue<*>? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [135:87] ==> val container: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty.<anonymous>[LocalVariableDescriptor]

'proto' @ [135:98] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[ValueParameterDescriptorImpl]

'property' @ [135:105] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'returnType' @ [135:114] ==> public final val DeserializedPropertyDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'property' @ [140:9] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'initialize' @ [140:18] ==> public open fun initialize(@Nullable getter: PropertyGetterDescriptorImpl?, @Nullable setter: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor[JavaMethodDescriptor]

'getter' @ [140:29] ==> val getter: PropertyGetterDescriptorImpl? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'setter' @ [140:37] ==> val setter: PropertySetterDescriptorImpl? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'property' @ [142:16] ==> val property: DeserializedPropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadProperty[LocalVariableDescriptor]

'oldFlags' @ [146:26] ==> value-parameter oldFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadOldFlags[ValueParameterDescriptorImpl]

'shl' @ [147:20] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'oldFlags' @ [147:21] ==> value-parameter oldFlags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadOldFlags[ValueParameterDescriptorImpl]

'lowSixBits' @ [148:16] ==> val lowSixBits: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadOldFlags[LocalVariableDescriptor]

'rest' @ [148:29] ==> val rest: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadOldFlags[LocalVariableDescriptor]

'if (proto.hasFlags()) proto.flags else loadOldFlags(proto.oldFlags)' @ [152:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [152:25] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'hasFlags' @ [152:31] ==> public open fun hasFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'proto' @ [152:43] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'flags' @ [152:49] ==> public final val ProtoBuf.Function.flags: Int[MyPropertyDescriptor]

'loadOldFlags' @ [152:60] ==> private final fun loadOldFlags(oldFlags: Int): Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [152:73] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'oldFlags' @ [152:79] ==> public final val ProtoBuf.Function.oldFlags: Int[MyPropertyDescriptor]

'getAnnotations' @ [153:27] ==> private final fun getAnnotations(proto: MessageLite, flags: Int, kind: AnnotatedCallableKind): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [153:42] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'flags' @ [153:49] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'FUNCTION' @ [153:78] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'if (proto.hasReceiver())
            getReceiverParameterAnnotations(proto, AnnotatedCallableKind.FUNCTION)
        else Annotations.EMPTY' @ [154:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Annotations, elseBranch: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Annotations

'proto' @ [154:39] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'hasReceiver' @ [154:45] ==> public fun ProtoBuf.Function.hasReceiver(): Boolean defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'getReceiverParameterAnnotations' @ [155:13] ==> private final fun getReceiverParameterAnnotations(proto: MessageLite, kind: AnnotatedCallableKind, receiverTargetedKind: AnnotatedCallableKind = ...): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [155:45] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'FUNCTION' @ [155:74] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Annotations' @ [156:14] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [156:26] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'DeserializedSimpleFunctionDescriptor' @ [157:24] ==> public constructor DeserializedSimpleFunctionDescriptor(containingDeclaration: DeclarationDescriptor, original: SimpleFunctionDescriptor?, annotations: Annotations, name: Name, kind: CallableMemberDescriptor.Kind, proto: ProtoBuf.Function, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?, source: SourceElement? = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor[ClassConstructorDescriptorImpl]

'c' @ [158:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [158:19] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotations' @ [158:65] ==> val annotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'c' @ [158:78] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [158:80] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [158:93] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [158:101] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'name' @ [158:107] ==> public final val ProtoBuf.Function.name: Int[MyPropertyDescriptor]

'Deserialization' @ [159:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'memberKind' @ [159:33] ==> @JvmStatic public final fun memberKind(memberKind: ProtoBuf.MemberKind?): CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MEMBER_KIND' @ [159:50] ==> public final val MEMBER_KIND: (Flags.FlagField<(ProtoBuf.MemberKind..ProtoBuf.MemberKind?)>..Flags.FlagField<(ProtoBuf.MemberKind..ProtoBuf.MemberKind?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [159:62] ==> public abstract operator fun get(flags: Int): (ProtoBuf.MemberKind..ProtoBuf.MemberKind?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [159:66] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'proto' @ [159:75] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'c' @ [159:82] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [159:84] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [159:98] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [159:100] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [159:111] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'sinceKotlinInfoTable' @ [159:113] ==> public final val sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [160:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containerSource' @ [160:19] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [162:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'childContext' @ [162:23] ==> public final fun childContext(descriptor: DeclarationDescriptor, typeParameterProtos: List<ProtoBuf.TypeParameter>, nameResolver: NameResolver = ..., typeTable: TypeTable = ...): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[SimpleFunctionDescriptorImpl]

'function' @ [162:36] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'proto' @ [162:46] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'typeParameterList' @ [162:52] ==> public final val ProtoBuf.Function.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'function' @ [163:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'initialize' @ [163:18] ==> @NotNull @Override public open fun initialize(@Nullable receiverParameterType: KotlinType?, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @NotNull typeParameters: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull unsubstitutedValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable unsubstitutedReturnType: KotlinType?, @Nullable modality: Modality?, @NotNull visibility: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor[JavaMethodDescriptor]

'proto' @ [164:17] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'receiverType' @ [164:23] ==> public fun ProtoBuf.Function.receiverType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [164:36] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [164:38] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'let' @ [164:50] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Type.let(block: (ProtoBuf.Type) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> KotlinType

'local' @ [164:56] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'typeDeserializer' @ [164:62] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [164:79] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [164:84] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction.<anonymous>[ValueParameterDescriptorImpl]

'receiverAnnotations' @ [164:88] ==> val receiverAnnotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'getDispatchReceiverParameter' @ [165:17] ==> private final fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'local' @ [166:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'typeDeserializer' @ [166:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'ownTypeParameters' @ [166:40] ==> public final val ownTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'local' @ [167:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'memberDeserializer' @ [167:23] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'valueParameters' @ [167:42] ==> private final fun valueParameters(valueParameters: List<ProtoBuf.ValueParameter>, callable: MessageLite, kind: AnnotatedCallableKind): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [167:58] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'valueParameterList' @ [167:64] ==> public final val ProtoBuf.Function.valueParameterList: (MutableList<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>..List<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>?)[MyPropertyDescriptor]

'proto' @ [167:84] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'FUNCTION' @ [167:113] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'local' @ [168:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'typeDeserializer' @ [168:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [168:40] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [168:45] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[ValueParameterDescriptorImpl]

'returnType' @ [168:51] ==> public fun ProtoBuf.Function.returnType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [168:62] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [168:64] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'Deserialization' @ [169:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'modality' @ [169:33] ==> @JvmStatic public final fun modality(modality: ProtoBuf.Modality?): Modality defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'MODALITY' @ [169:48] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [169:57] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [169:61] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'Deserialization' @ [170:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [170:33] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [170:50] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [170:61] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [170:65] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [172:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isOperator' @ [172:18] ==> public final var DeserializedSimpleFunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'IS_OPERATOR' @ [172:37] ==> public final val IS_OPERATOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [172:49] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [172:53] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [173:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isInfix' @ [173:18] ==> public final var DeserializedSimpleFunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'IS_INFIX' @ [173:34] ==> public final val IS_INFIX: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [173:43] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [173:47] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [174:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isExternal' @ [174:18] ==> public final var DeserializedSimpleFunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'IS_EXTERNAL_FUNCTION' @ [174:37] ==> public final val IS_EXTERNAL_FUNCTION: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [174:58] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [174:62] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [175:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isInline' @ [175:18] ==> public final var DeserializedSimpleFunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'IS_INLINE' @ [175:35] ==> public final val IS_INLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [175:45] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [175:49] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [176:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isTailrec' @ [176:18] ==> public final var DeserializedSimpleFunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'IS_TAILREC' @ [176:36] ==> public final val IS_TAILREC: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [176:47] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [176:51] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [177:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isSuspend' @ [177:18] ==> public final var DeserializedSimpleFunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'IS_SUSPEND' @ [177:36] ==> public final val IS_SUSPEND: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [177:47] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [177:51] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [178:9] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'isHeader' @ [178:18] ==> public final var DeserializedSimpleFunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'IS_HEADER_FUNCTION' @ [178:35] ==> public final val IS_HEADER_FUNCTION: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [178:54] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [178:58] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'function' @ [179:16] ==> val function: DeserializedSimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadFunction[LocalVariableDescriptor]

'AnnotationsImpl' @ [183:27] ==> public constructor AnnotationsImpl(annotations: List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationsImpl[ClassConstructorDescriptorImpl]

'proto' @ [183:43] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'annotationList' @ [183:49] ==> public final val ProtoBuf.TypeAlias.annotationList: (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)[MyPropertyDescriptor]

'map' @ [183:64] ==> public inline fun <T, R> Iterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>.map(transform: ((ProtoBuf.Annotation..ProtoBuf.Annotation?)) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)
    <R> -> AnnotationDescriptor

'annotationDeserializer' @ [183:70] ==> private final val annotationDeserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'deserializeAnnotation' @ [183:93] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [183:115] ==> value-parameter it: (ProtoBuf.Annotation..ProtoBuf.Annotation?) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [183:119] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [183:121] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'Deserialization' @ [185:26] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [185:42] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [185:59] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [185:70] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'proto' @ [185:74] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'flags' @ [185:80] ==> public final val ProtoBuf.TypeAlias.flags: Int[MyPropertyDescriptor]

'DeserializedTypeAliasDescriptor' @ [186:25] ==> public constructor DeserializedTypeAliasDescriptor(storageManager: StorageManager, containingDeclaration: DeclarationDescriptor, annotations: Annotations, name: Name, visibility: Visibility, proto: ProtoBuf.TypeAlias, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor[ClassConstructorDescriptorImpl]

'c' @ [187:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'storageManager' @ [187:19] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [187:35] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [187:37] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotations' @ [187:60] ==> val annotations: AnnotationsImpl defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'c' @ [187:73] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [187:75] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [187:88] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [187:96] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'name' @ [187:102] ==> public final val ProtoBuf.TypeAlias.name: Int[MyPropertyDescriptor]

'visibility' @ [188:17] ==> val visibility: Visibility defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'proto' @ [188:29] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'c' @ [188:36] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [188:38] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [188:52] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [188:54] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [188:65] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'sinceKotlinInfoTable' @ [188:67] ==> public final val sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [188:89] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containerSource' @ [188:91] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [191:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'childContext' @ [191:23] ==> public final fun childContext(descriptor: DeclarationDescriptor, typeParameterProtos: List<ProtoBuf.TypeParameter>, nameResolver: NameResolver = ..., typeTable: TypeTable = ...): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[SimpleFunctionDescriptorImpl]

'typeAlias' @ [191:36] ==> val typeAlias: DeserializedTypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'proto' @ [191:47] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'typeParameterList' @ [191:53] ==> public final val ProtoBuf.TypeAlias.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'typeAlias' @ [192:9] ==> val typeAlias: DeserializedTypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'initialize' @ [192:19] ==> public final fun initialize(declaredTypeParameters: List<TypeParameterDescriptor>, underlyingType: SimpleType, expandedType: SimpleType): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor[SimpleFunctionDescriptorImpl]

'local' @ [193:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'typeDeserializer' @ [193:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'ownTypeParameters' @ [193:40] ==> public final val ownTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'local' @ [194:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'typeDeserializer' @ [194:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'simpleType' @ [194:40] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [194:51] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'underlyingType' @ [194:57] ==> public fun ProtoBuf.TypeAlias.underlyingType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [194:72] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [194:74] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'local' @ [195:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'typeDeserializer' @ [195:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'simpleType' @ [195:40] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [195:51] ==> value-parameter proto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[ValueParameterDescriptorImpl]

'expandedType' @ [195:57] ==> public fun ProtoBuf.TypeAlias.expandedType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [195:70] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [195:72] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'typeAlias' @ [198:16] ==> val typeAlias: DeserializedTypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadTypeAlias[LocalVariableDescriptor]

'c' @ [202:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [202:19] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'thisAsReceiverParameter' @ [202:63] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'c' @ [206:31] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [206:33] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'DeserializedClassConstructorDescriptor' @ [207:26] ==> public constructor DeserializedClassConstructorDescriptor(containingDeclaration: ClassDescriptor, original: ConstructorDescriptor?, annotations: Annotations, isPrimary: Boolean, kind: CallableMemberDescriptor.Kind, proto: ProtoBuf.Constructor, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?, source: SourceElement? = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor[ClassConstructorDescriptorImpl]

'classDescriptor' @ [208:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'getAnnotations' @ [208:40] ==> private final fun getAnnotations(proto: MessageLite, flags: Int, kind: AnnotatedCallableKind): Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [208:55] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'proto' @ [208:62] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'flags' @ [208:68] ==> public final val ProtoBuf.Constructor.flags: Int[MyPropertyDescriptor]

'FUNCTION' @ [208:97] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'isPrimary' @ [209:17] ==> value-parameter isPrimary: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'DECLARATION' @ [209:58] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'proto' @ [209:71] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'c' @ [209:78] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [209:80] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [209:94] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [209:96] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [209:107] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'sinceKotlinInfoTable' @ [209:109] ==> public final val sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [210:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containerSource' @ [210:19] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [212:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'childContext' @ [212:23] ==> public final fun childContext(descriptor: DeclarationDescriptor, typeParameterProtos: List<ProtoBuf.TypeParameter>, nameResolver: NameResolver = ..., typeTable: TypeTable = ...): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[SimpleFunctionDescriptorImpl]

'descriptor' @ [212:36] ==> val descriptor: DeserializedClassConstructorDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'listOf' @ [212:48] ==> @InlineOnly public inline fun <T> listOf(): List<ProtoBuf.TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'descriptor' @ [213:9] ==> val descriptor: DeserializedClassConstructorDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'initialize' @ [213:20] ==> public open fun initialize(@NotNull unsubstitutedValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull visibility: Visibility): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor[JavaMethodDescriptor]

'local' @ [214:17] ==> val local: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'memberDeserializer' @ [214:23] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'valueParameters' @ [214:42] ==> private final fun valueParameters(valueParameters: List<ProtoBuf.ValueParameter>, callable: MessageLite, kind: AnnotatedCallableKind): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [214:58] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'valueParameterList' @ [214:64] ==> public final val ProtoBuf.Constructor.valueParameterList: (MutableList<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>..List<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>?)[MyPropertyDescriptor]

'proto' @ [214:84] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'FUNCTION' @ [214:113] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'Deserialization' @ [215:17] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'visibility' @ [215:33] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'VISIBILITY' @ [215:50] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [215:61] ==> public abstract operator fun get(flags: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'proto' @ [215:65] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[ValueParameterDescriptorImpl]

'flags' @ [215:71] ==> public final val ProtoBuf.Constructor.flags: Int[MyPropertyDescriptor]

'descriptor' @ [217:9] ==> val descriptor: DeserializedClassConstructorDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'returnType' @ [217:20] ==> public final var DeserializedClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'classDescriptor' @ [217:33] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'defaultType' @ [217:49] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'descriptor' @ [218:16] ==> val descriptor: DeserializedClassConstructorDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.loadConstructor[LocalVariableDescriptor]

'!' @ [222:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'HAS_ANNOTATIONS' @ [222:20] ==> public final val HAS_ANNOTATIONS: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [222:36] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [222:40] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getAnnotations[ValueParameterDescriptorImpl]

'Annotations' @ [223:20] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [223:32] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'NonEmptyDeserializedAnnotationsWithPossibleTargets' @ [225:16] ==> public constructor NonEmptyDeserializedAnnotationsWithPossibleTargets(storageManager: StorageManager, compute: () -> List<AnnotationWithTarget>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotationsWithPossibleTargets[ClassConstructorDescriptorImpl]

'c' @ [225:67] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'storageManager' @ [225:69] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [226:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [226:15] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'asProtoContainer' @ [226:37] ==> private final fun DeclarationDescriptor.asProtoContainer(): ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'let' @ [226:57] ==> @InlineOnly public inline fun <T, R> ProtoContainer.let(block: (ProtoContainer) -> List<AnnotationWithTarget>): List<AnnotationWithTarget> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProtoContainer
    <R> -> List<AnnotationWithTarget>

'c' @ [227:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [227:19] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [227:30] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadCallableAnnotations' @ [227:58] ==> public abstract fun loadCallableAnnotations(container: ProtoContainer, proto: MessageLite, kind: AnnotatedCallableKind): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'it' @ [227:82] ==> value-parameter it: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [227:86] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getAnnotations[ValueParameterDescriptorImpl]

'kind' @ [227:93] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getAnnotations[ValueParameterDescriptorImpl]

'toList' @ [227:99] ==> public fun <T> Iterable<AnnotationWithTarget>.toList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'orEmpty' @ [228:15] ==> @InlineOnly public inline fun <T> List<AnnotationWithTarget>?.orEmpty(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'kind' @ [235:59] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'DeserializedAnnotationsWithPossibleTargets' @ [237:16] ==> public constructor DeserializedAnnotationsWithPossibleTargets(storageManager: StorageManager, compute: () -> List<AnnotationWithTarget>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[ClassConstructorDescriptorImpl]

'c' @ [237:59] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'storageManager' @ [237:61] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [238:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [238:15] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'asProtoContainer' @ [238:37] ==> private final fun DeclarationDescriptor.asProtoContainer(): ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'let' @ [238:57] ==> @InlineOnly public inline fun <T, R> ProtoContainer.let(block: (ProtoContainer) -> List<AnnotationWithTarget>): List<AnnotationWithTarget> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProtoContainer
    <R> -> List<AnnotationWithTarget>

'c' @ [239:17] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [239:19] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [239:30] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadExtensionReceiverParameterAnnotations' @ [240:26] ==> public abstract fun loadExtensionReceiverParameterAnnotations(container: ProtoContainer, proto: MessageLite, kind: AnnotatedCallableKind): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'it' @ [240:68] ==> value-parameter it: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [240:72] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'receiverTargetedKind' @ [240:79] ==> value-parameter receiverTargetedKind: AnnotatedCallableKind = ... defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'map' @ [241:26] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [241:32] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[ClassConstructorDescriptorImpl]

'it' @ [241:53] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AnnotationUseSiteTarget' @ [241:57] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'RECEIVER' @ [241:81] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'toList' @ [242:26] ==> public fun <T> Iterable<AnnotationWithTarget>.toList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'orEmpty' @ [243:15] ==> @InlineOnly public inline fun <T> List<AnnotationWithTarget>?.orEmpty(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'c' @ [252:34] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [252:36] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'callableDescriptor' @ [253:35] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[LocalVariableDescriptor]

'containingDeclaration' @ [253:54] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'asProtoContainer' @ [253:76] ==> private final fun DeclarationDescriptor.asProtoContainer(): ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'valueParameters' @ [255:16] ==> value-parameter valueParameters: List<ProtoBuf.ValueParameter> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[ValueParameterDescriptorImpl]

'mapIndexed' @ [255:32] ==> public inline fun <T, R> Iterable<ProtoBuf.ValueParameter>.mapIndexed(transform: (index: Int, ProtoBuf.ValueParameter) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameter
    <R> -> ValueParameterDescriptorImpl

'if (proto.hasFlags()) proto.flags else 0' @ [256:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [256:29] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'hasFlags' @ [256:35] ==> public open fun hasFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]

'proto' @ [256:47] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'flags' @ [256:53] ==> public final val ProtoBuf.ValueParameter.flags: Int[MyPropertyDescriptor]

'if (containerOfCallable != null && Flags.HAS_ANNOTATIONS.get(flags)) {
                NonEmptyDeserializedAnnotations(c.storageManager) {
                    c.components.annotationAndConstantLoader
                            .loadValueParameterAnnotations(containerOfCallable, callable, kind, i, proto)
                            .toList()
                }
            }
            else Annotations.EMPTY' @ [257:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Annotations, elseBranch: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Annotations

'containerOfCallable' @ [257:35] ==> val containerOfCallable: ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[LocalVariableDescriptor]

'HAS_ANNOTATIONS' @ [257:72] ==> public final val HAS_ANNOTATIONS: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [257:88] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [257:92] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[LocalVariableDescriptor]

'NonEmptyDeserializedAnnotations' @ [258:17] ==> public constructor NonEmptyDeserializedAnnotations(storageManager: StorageManager, compute: () -> List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations[ClassConstructorDescriptorImpl]

'c' @ [258:49] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'storageManager' @ [258:51] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [259:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'components' @ [259:23] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [259:34] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadValueParameterAnnotations' @ [260:30] ==> public abstract fun loadValueParameterAnnotations(container: ProtoContainer, callableProto: MessageLite, kind: AnnotatedCallableKind, parameterIndex: Int, proto: ProtoBuf.ValueParameter): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'containerOfCallable' @ [260:60] ==> val containerOfCallable: ProtoContainer? defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[LocalVariableDescriptor]

'callable' @ [260:81] ==> value-parameter callable: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[ValueParameterDescriptorImpl]

'kind' @ [260:91] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[ValueParameterDescriptorImpl]

'i' @ [260:97] ==> value-parameter i: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [260:100] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [261:30] ==> public fun <T> Iterable<AnnotationDescriptor>.toList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'Annotations' @ [264:18] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [264:30] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'ValueParameterDescriptorImpl' @ [265:13] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[ClassConstructorDescriptorImpl]

'callableDescriptor' @ [266:21] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters[LocalVariableDescriptor]

'i' @ [266:47] ==> value-parameter i: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [267:21] ==> val annotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[LocalVariableDescriptor]

'c' @ [268:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [268:23] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [268:36] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [268:44] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [268:50] ==> public final val ProtoBuf.ValueParameter.name: Int[MyPropertyDescriptor]

'c' @ [269:21] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeDeserializer' @ [269:23] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [269:40] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [269:45] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [269:51] ==> public fun ProtoBuf.ValueParameter.type(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [269:56] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [269:58] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'DECLARES_DEFAULT_VALUE' @ [270:27] ==> public final val DECLARES_DEFAULT_VALUE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [270:50] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [270:54] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[LocalVariableDescriptor]

'IS_CROSSINLINE' @ [271:27] ==> public final val IS_CROSSINLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [271:42] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [271:46] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[LocalVariableDescriptor]

'IS_NOINLINE' @ [272:27] ==> public final val IS_NOINLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [272:39] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [272:43] ==> val flags: Int defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[LocalVariableDescriptor]

'proto' @ [273:21] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [273:27] ==> public fun ProtoBuf.ValueParameter.varargElementType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [273:45] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [273:47] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'let' @ [273:59] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Type.let(block: (ProtoBuf.Type) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> KotlinType

'c' @ [273:65] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeDeserializer' @ [273:67] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [273:84] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [273:89] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.valueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [274:35] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'toList' @ [276:11] ==> public fun <T> Iterable<ValueParameterDescriptorImpl>.toList(): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptorImpl

'when (this) {
        is PackageFragmentDescriptor -> ProtoContainer.Package(fqName, c.nameResolver, c.typeTable, c.containerSource)
        is DeserializedClassDescriptor -> thisAsProtoContainer
        else -> null // TODO: support annotations on lambdas and their parameters
    }' @ [279:77] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoContainer?, entry1: ProtoContainer?, entry2: ProtoContainer?): ProtoContainer?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ProtoContainer?

'this' @ [279:83] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer.asProtoContainer[ReceiverParameterDescriptorImpl]

'Package' @ [280:56] ==> public constructor Package(fqName: FqName, nameResolver: NameResolver, typeTable: TypeTable, source: SourceElement?) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Package[ClassConstructorDescriptorImpl]

'fqName' @ [280:64] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'c' @ [280:72] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [280:74] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [280:88] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'typeTable' @ [280:90] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [280:101] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[PropertyDescriptorImpl]

'containerSource' @ [280:103] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'thisAsProtoContainer' @ [281:43] ==> internal final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

