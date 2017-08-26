'JvmStatic' @ [28:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (memberKind) {
        ProtoBuf.MemberKind.DECLARATION -> CallableMemberDescriptor.Kind.DECLARATION
        ProtoBuf.MemberKind.FAKE_OVERRIDE -> CallableMemberDescriptor.Kind.FAKE_OVERRIDE
        ProtoBuf.MemberKind.DELEGATION -> CallableMemberDescriptor.Kind.DELEGATION
        ProtoBuf.MemberKind.SYNTHESIZED -> CallableMemberDescriptor.Kind.SYNTHESIZED
        else -> CallableMemberDescriptor.Kind.DECLARATION
    }' @ [29:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableMemberDescriptor.Kind, entry1: CallableMemberDescriptor.Kind, entry2: CallableMemberDescriptor.Kind, entry3: CallableMemberDescriptor.Kind, entry4: CallableMemberDescriptor.Kind): CallableMemberDescriptor.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Kind

'memberKind' @ [29:62] ==> value-parameter memberKind: ProtoBuf.MemberKind? defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.memberKind[ValueParameterDescriptorImpl]

'DECLARATION' @ [30:29] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.serialization.ProtoBuf.MemberKind[FakeCallableDescriptorForObject]

'DECLARATION' @ [30:74] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'FAKE_OVERRIDE' @ [31:29] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.serialization.ProtoBuf.MemberKind[FakeCallableDescriptorForObject]

'FAKE_OVERRIDE' @ [31:76] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DELEGATION' @ [32:29] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.serialization.ProtoBuf.MemberKind[FakeCallableDescriptorForObject]

'DELEGATION' @ [32:73] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'SYNTHESIZED' @ [33:29] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.serialization.ProtoBuf.MemberKind[FakeCallableDescriptorForObject]

'SYNTHESIZED' @ [33:74] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DECLARATION' @ [34:47] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'JvmStatic' @ [37:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (modality) {
        ProtoBuf.Modality.FINAL -> Modality.FINAL
        ProtoBuf.Modality.OPEN -> Modality.OPEN
        ProtoBuf.Modality.ABSTRACT -> Modality.ABSTRACT
        ProtoBuf.Modality.SEALED -> Modality.SEALED
        else -> Modality.FINAL
    }' @ [38:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Modality, entry1: Modality, entry2: Modality, entry3: Modality, entry4: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Modality

'modality' @ [38:56] ==> value-parameter modality: ProtoBuf.Modality? defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.modality[ValueParameterDescriptorImpl]

'FINAL' @ [39:27] ==> enum entry FINAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [39:45] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [40:27] ==> enum entry OPEN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [40:44] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [41:27] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [41:48] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [42:27] ==> enum entry SEALED defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [42:46] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [43:26] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'JvmStatic' @ [46:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (visibility) {
        ProtoBuf.Visibility.INTERNAL -> Visibilities.INTERNAL
        ProtoBuf.Visibility.PRIVATE -> Visibilities.PRIVATE
        ProtoBuf.Visibility.PRIVATE_TO_THIS -> Visibilities.PRIVATE_TO_THIS
        ProtoBuf.Visibility.PROTECTED -> Visibilities.PROTECTED
        ProtoBuf.Visibility.PUBLIC -> Visibilities.PUBLIC
        ProtoBuf.Visibility.LOCAL -> Visibilities.LOCAL
        else -> Visibilities.PRIVATE
    }' @ [47:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility, entry2: Visibility, entry3: Visibility, entry4: Visibility, entry5: Visibility, entry6: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'visibility' @ [47:62] ==> value-parameter visibility: ProtoBuf.Visibility? defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.visibility[ValueParameterDescriptorImpl]

'INTERNAL' @ [48:29] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'INTERNAL' @ [48:54] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE' @ [49:29] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PRIVATE' @ [49:53] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE_TO_THIS' @ [50:29] ==> enum entry PRIVATE_TO_THIS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PRIVATE_TO_THIS' @ [50:61] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PROTECTED' @ [51:29] ==> enum entry PROTECTED defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PROTECTED' @ [51:55] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC' @ [52:29] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PUBLIC' @ [52:52] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'LOCAL' @ [53:29] ==> enum entry LOCAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'LOCAL' @ [53:51] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE' @ [54:30] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'JvmStatic' @ [57:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (kind) {
        ProtoBuf.Class.Kind.CLASS -> ClassKind.CLASS
        ProtoBuf.Class.Kind.INTERFACE -> ClassKind.INTERFACE
        ProtoBuf.Class.Kind.ENUM_CLASS -> ClassKind.ENUM_CLASS
        ProtoBuf.Class.Kind.ENUM_ENTRY -> ClassKind.ENUM_ENTRY
        ProtoBuf.Class.Kind.ANNOTATION_CLASS -> ClassKind.ANNOTATION_CLASS
        ProtoBuf.Class.Kind.OBJECT, ProtoBuf.Class.Kind.COMPANION_OBJECT -> ClassKind.OBJECT
        else -> ClassKind.CLASS
    }' @ [58:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassKind, entry1: ClassKind, entry2: ClassKind, entry3: ClassKind, entry4: ClassKind, entry5: ClassKind, entry6: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassKind

'kind' @ [58:66] ==> value-parameter kind: ProtoBuf.Class.Kind? defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.classKind[ValueParameterDescriptorImpl]

'CLASS' @ [59:29] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'CLASS' @ [59:48] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'INTERFACE' @ [60:29] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'INTERFACE' @ [60:52] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [61:29] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [61:53] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [62:29] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [62:53] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ANNOTATION_CLASS' @ [63:29] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'ANNOTATION_CLASS' @ [63:59] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'OBJECT' @ [64:29] ==> enum entry OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'COMPANION_OBJECT' @ [64:57] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'OBJECT' @ [64:87] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'CLASS' @ [65:27] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'JvmStatic' @ [68:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (variance) {
        ProtoBuf.TypeParameter.Variance.IN -> Variance.IN_VARIANCE
        ProtoBuf.TypeParameter.Variance.OUT -> Variance.OUT_VARIANCE
        ProtoBuf.TypeParameter.Variance.INV -> Variance.INVARIANT
        else -> Variance.INVARIANT
    }' @ [69:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance, entry3: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'variance' @ [69:60] ==> value-parameter variance: ProtoBuf.TypeParameter.Variance defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.variance[ValueParameterDescriptorImpl]

'IN' @ [70:41] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [70:56] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [71:41] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [71:57] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INV' @ [72:41] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [72:57] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [73:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'JvmStatic' @ [76:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (variance) {
        ProtoBuf.Type.Argument.Projection.IN -> Variance.IN_VARIANCE
        ProtoBuf.Type.Argument.Projection.OUT -> Variance.OUT_VARIANCE
        ProtoBuf.Type.Argument.Projection.INV -> Variance.INVARIANT
        ProtoBuf.Type.Argument.Projection.STAR ->
            throw IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: $variance")
        else -> Variance.INVARIANT
    }' @ [77:65] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance, entry3: Variance, entry4: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'variance' @ [77:71] ==> value-parameter variance: ProtoBuf.Type.Argument.Projection defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.variance[ValueParameterDescriptorImpl]

'IN' @ [78:43] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [78:58] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [79:43] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [79:59] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INV' @ [80:43] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'INVARIANT' @ [80:59] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'STAR' @ [81:43] ==> enum entry STAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [82:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'variance' @ [82:99] ==> value-parameter variance: ProtoBuf.Type.Argument.Projection defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization.variance[ValueParameterDescriptorImpl]

'INVARIANT' @ [83:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

