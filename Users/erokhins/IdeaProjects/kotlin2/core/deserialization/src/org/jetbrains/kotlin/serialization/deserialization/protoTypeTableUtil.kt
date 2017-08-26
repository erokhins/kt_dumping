'supertypeList' @ [23:12] ==> public final val ProtoBuf.Class.supertypeList: (MutableList<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)[MyPropertyDescriptor]

'ifEmpty' @ [23:26] ==> public inline fun <T, C : Collection<(ProtoBuf.Type..ProtoBuf.Type?)>> (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?).ifEmpty(body: () -> (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)): (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?) defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)
    <C : Collection<T>> -> (kotlin.collections.List<org.jetbrains.kotlin.serialization.ProtoBuf.Type>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>?)

'supertypeIdList' @ [23:36] ==> public final val ProtoBuf.Class.supertypeIdList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'map' @ [23:52] ==> public inline fun <T, R> Iterable<(Int..Int?)>.map(transform: ((Int..Int?)) -> ProtoBuf.Type): List<ProtoBuf.Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)
    <R> -> Type

'typeTable' @ [23:58] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.supertypes[ValueParameterDescriptorImpl]

'it' @ [23:68] ==> value-parameter it: (Int..Int?) defined in org.jetbrains.kotlin.serialization.deserialization.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when {
        hasType() -> type
        hasTypeId() -> typeTable[typeId]
        else -> null
    }' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasType' @ [28:9] ==> public open fun hasType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument[JavaMethodDescriptor]

'type' @ [28:22] ==> public final val ProtoBuf.Type.Argument.type: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasTypeId' @ [29:9] ==> public open fun hasTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument[JavaMethodDescriptor]

'typeTable' @ [29:24] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.type[ValueParameterDescriptorImpl]

'typeId' @ [29:34] ==> public final val ProtoBuf.Type.Argument.typeId: Int[MyPropertyDescriptor]

'when {
        hasFlexibleUpperBound() -> flexibleUpperBound
        hasFlexibleUpperBoundId() -> typeTable[flexibleUpperBoundId]
        else -> null
    }' @ [35:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasFlexibleUpperBound' @ [36:9] ==> public open fun hasFlexibleUpperBound(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'flexibleUpperBound' @ [36:36] ==> public final val ProtoBuf.Type.flexibleUpperBound: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasFlexibleUpperBoundId' @ [37:9] ==> public open fun hasFlexibleUpperBoundId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'typeTable' @ [37:38] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.flexibleUpperBound[ValueParameterDescriptorImpl]

'flexibleUpperBoundId' @ [37:48] ==> public final val ProtoBuf.Type.flexibleUpperBoundId: Int[MyPropertyDescriptor]

'upperBoundList' @ [43:12] ==> public final val ProtoBuf.TypeParameter.upperBoundList: (MutableList<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)[MyPropertyDescriptor]

'ifEmpty' @ [43:27] ==> public inline fun <T, C : Collection<(ProtoBuf.Type..ProtoBuf.Type?)>> (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?).ifEmpty(body: () -> (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)): (List<ProtoBuf.Type>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?) defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)
    <C : Collection<T>> -> (kotlin.collections.List<org.jetbrains.kotlin.serialization.ProtoBuf.Type>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>?)

'upperBoundIdList' @ [43:37] ==> public final val ProtoBuf.TypeParameter.upperBoundIdList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'map' @ [43:54] ==> public inline fun <T, R> Iterable<(Int..Int?)>.map(transform: ((Int..Int?)) -> ProtoBuf.Type): List<ProtoBuf.Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)
    <R> -> Type

'typeTable' @ [43:60] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.upperBounds[ValueParameterDescriptorImpl]

'it' @ [43:70] ==> value-parameter it: (Int..Int?) defined in org.jetbrains.kotlin.serialization.deserialization.upperBounds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (hasReturnType()) returnType else typeTable[returnTypeId]' @ [47:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoBuf.Type, elseBranch: ProtoBuf.Type): ProtoBuf.Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'hasReturnType' @ [47:16] ==> public open fun hasReturnType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'returnType' @ [47:33] ==> public final val ProtoBuf.Function.returnType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'typeTable' @ [47:49] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.returnType[ValueParameterDescriptorImpl]

'returnTypeId' @ [47:59] ==> public final val ProtoBuf.Function.returnTypeId: Int[MyPropertyDescriptor]

'hasReceiverType' @ [50:48] ==> public open fun hasReceiverType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'hasReceiverTypeId' @ [50:69] ==> public open fun hasReceiverTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'when {
        hasReceiverType() -> receiverType
        hasReceiverTypeId() -> typeTable[receiverTypeId]
        else -> null
    }' @ [53:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasReceiverType' @ [54:9] ==> public open fun hasReceiverType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'receiverType' @ [54:30] ==> public final val ProtoBuf.Function.receiverType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasReceiverTypeId' @ [55:9] ==> public open fun hasReceiverTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'typeTable' @ [55:32] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.receiverType[ValueParameterDescriptorImpl]

'receiverTypeId' @ [55:42] ==> public final val ProtoBuf.Function.receiverTypeId: Int[MyPropertyDescriptor]

'if (hasReturnType()) returnType else typeTable[returnTypeId]' @ [61:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoBuf.Type, elseBranch: ProtoBuf.Type): ProtoBuf.Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'hasReturnType' @ [61:16] ==> public open fun hasReturnType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'returnType' @ [61:33] ==> public final val ProtoBuf.Property.returnType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'typeTable' @ [61:49] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.returnType[ValueParameterDescriptorImpl]

'returnTypeId' @ [61:59] ==> public final val ProtoBuf.Property.returnTypeId: Int[MyPropertyDescriptor]

'hasReceiverType' @ [64:48] ==> public open fun hasReceiverType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'hasReceiverTypeId' @ [64:69] ==> public open fun hasReceiverTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'when {
        hasReceiverType() -> receiverType
        hasReceiverTypeId() -> typeTable[receiverTypeId]
        else -> null
    }' @ [67:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasReceiverType' @ [68:9] ==> public open fun hasReceiverType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'receiverType' @ [68:30] ==> public final val ProtoBuf.Property.receiverType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasReceiverTypeId' @ [69:9] ==> public open fun hasReceiverTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'typeTable' @ [69:32] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.receiverType[ValueParameterDescriptorImpl]

'receiverTypeId' @ [69:42] ==> public final val ProtoBuf.Property.receiverTypeId: Int[MyPropertyDescriptor]

'if (hasType()) type else typeTable[typeId]' @ [75:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoBuf.Type, elseBranch: ProtoBuf.Type): ProtoBuf.Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'hasType' @ [75:16] ==> public open fun hasType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]

'type' @ [75:27] ==> public final val ProtoBuf.ValueParameter.type: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'typeTable' @ [75:37] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.type[ValueParameterDescriptorImpl]

'typeId' @ [75:47] ==> public final val ProtoBuf.ValueParameter.typeId: Int[MyPropertyDescriptor]

'when {
        hasVarargElementType() -> varargElementType
        hasVarargElementTypeId() -> typeTable[varargElementTypeId]
        else -> null
    }' @ [79:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasVarargElementType' @ [80:9] ==> public open fun hasVarargElementType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]

'varargElementType' @ [80:35] ==> public final val ProtoBuf.ValueParameter.varargElementType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasVarargElementTypeId' @ [81:9] ==> public open fun hasVarargElementTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]

'typeTable' @ [81:37] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.varargElementType[ValueParameterDescriptorImpl]

'varargElementTypeId' @ [81:47] ==> public final val ProtoBuf.ValueParameter.varargElementTypeId: Int[MyPropertyDescriptor]

'when {
        hasOuterType() -> outerType
        hasOuterTypeId() -> typeTable[outerTypeId]
        else -> null
    }' @ [87:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasOuterType' @ [88:9] ==> public open fun hasOuterType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'outerType' @ [88:27] ==> public final val ProtoBuf.Type.outerType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasOuterTypeId' @ [89:9] ==> public open fun hasOuterTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'typeTable' @ [89:29] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.outerType[ValueParameterDescriptorImpl]

'outerTypeId' @ [89:39] ==> public final val ProtoBuf.Type.outerTypeId: Int[MyPropertyDescriptor]

'when {
            hasAbbreviatedType() -> abbreviatedType
            hasAbbreviatedTypeId() -> typeTable[abbreviatedTypeId]
            else -> null
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoBuf.Type?, entry1: ProtoBuf.Type?, entry2: ProtoBuf.Type?): ProtoBuf.Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'hasAbbreviatedType' @ [96:13] ==> public open fun hasAbbreviatedType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'abbreviatedType' @ [96:37] ==> public final val ProtoBuf.Type.abbreviatedType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'hasAbbreviatedTypeId' @ [97:13] ==> public open fun hasAbbreviatedTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'typeTable' @ [97:39] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.abbreviatedType[ValueParameterDescriptorImpl]

'abbreviatedTypeId' @ [97:49] ==> public final val ProtoBuf.Type.abbreviatedTypeId: Int[MyPropertyDescriptor]

'if (hasUnderlyingTypeId()) typeTable[underlyingTypeId] else underlyingType' @ [102:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoBuf.Type, elseBranch: ProtoBuf.Type): ProtoBuf.Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'hasUnderlyingTypeId' @ [102:13] ==> public open fun hasUnderlyingTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias[JavaMethodDescriptor]

'typeTable' @ [102:36] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.underlyingType[ValueParameterDescriptorImpl]

'underlyingTypeId' @ [102:46] ==> public final val ProtoBuf.TypeAlias.underlyingTypeId: Int[MyPropertyDescriptor]

'underlyingType' @ [102:69] ==> public final val ProtoBuf.TypeAlias.underlyingType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'if (hasExpandedTypeId()) typeTable[expandedTypeId] else expandedType' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoBuf.Type, elseBranch: ProtoBuf.Type): ProtoBuf.Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'hasExpandedTypeId' @ [105:13] ==> public open fun hasExpandedTypeId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias[JavaMethodDescriptor]

'typeTable' @ [105:34] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.expandedType[ValueParameterDescriptorImpl]

'expandedTypeId' @ [105:44] ==> public final val ProtoBuf.TypeAlias.expandedTypeId: Int[MyPropertyDescriptor]

'expandedType' @ [105:65] ==> public final val ProtoBuf.TypeAlias.expandedType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

