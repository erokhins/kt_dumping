'run' @ [22:38] ==> @InlineOnly public inline fun <T, R> TypeTable.run(block: TypeTable.() -> (List<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)): (List<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeTable
    <R> -> (kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>?)

'typeTable' @ [23:29] ==> value-parameter typeTable: ProtoBuf.TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.<init>[ValueParameterDescriptorImpl]

'typeList' @ [23:39] ==> public final val ProtoBuf.TypeTable.typeList: (MutableList<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)[MyPropertyDescriptor]

'if (typeTable.hasFirstNullable()) {
            val firstNullable = typeTable.firstNullable
            typeTable.typeList.mapIndexed { i, type ->
                if (i >= firstNullable) {
                    type.toBuilder().setNullable(true).build()
                }
                else type
            }
        }
        else originalTypes' @ [24:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?), elseBranch: (List<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)): (List<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)>?)

'typeTable' @ [24:13] ==> value-parameter typeTable: ProtoBuf.TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.<init>[ValueParameterDescriptorImpl]

'hasFirstNullable' @ [24:23] ==> public open fun hasFirstNullable(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeTable[JavaMethodDescriptor]

'typeTable' @ [25:33] ==> value-parameter typeTable: ProtoBuf.TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.<init>[ValueParameterDescriptorImpl]

'firstNullable' @ [25:43] ==> public final val ProtoBuf.TypeTable.firstNullable: Int[MyPropertyDescriptor]

'typeTable' @ [26:13] ==> value-parameter typeTable: ProtoBuf.TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.<init>[ValueParameterDescriptorImpl]

'typeList' @ [26:23] ==> public final val ProtoBuf.TypeTable.typeList: (MutableList<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?)[MyPropertyDescriptor]

'mapIndexed' @ [26:32] ==> public inline fun <T, R> Iterable<(ProtoBuf.Type..ProtoBuf.Type?)>.mapIndexed(transform: (index: Int, (ProtoBuf.Type..ProtoBuf.Type?)) -> (ProtoBuf.Type..ProtoBuf.Type?)): List<(ProtoBuf.Type..ProtoBuf.Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)
    <R> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)

'if (i >= firstNullable) {
                    type.toBuilder().setNullable(true).build()
                }
                else type' @ [27:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ProtoBuf.Type..ProtoBuf.Type?), elseBranch: (ProtoBuf.Type..ProtoBuf.Type?)): (ProtoBuf.Type..ProtoBuf.Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type..org.jetbrains.kotlin.serialization.ProtoBuf.Type?)

'i' @ [27:21] ==> value-parameter i: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.types.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'firstNullable' @ [27:26] ==> val firstNullable: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.types.<anonymous>[LocalVariableDescriptor]

'type' @ [28:21] ==> value-parameter type: (ProtoBuf.Type..ProtoBuf.Type?) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.types.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toBuilder' @ [28:26] ==> public open fun toBuilder(): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'setNullable' @ [28:38] ==> public open fun setNullable(value: Boolean): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'build' @ [28:56] ==> public open fun build(): (ProtoBuf.Type..ProtoBuf.Type?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]

'type' @ [30:22] ==> value-parameter type: (ProtoBuf.Type..ProtoBuf.Type?) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.types.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'originalTypes' @ [33:14] ==> val originalTypes: (MutableList<(ProtoBuf.Type..ProtoBuf.Type?)>..List<(ProtoBuf.Type..ProtoBuf.Type?)>?) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.types.<anonymous>[LocalVariableDescriptor]

'types' @ [36:36] ==> public final val types: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[PropertyDescriptorImpl]

'index' @ [36:42] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable.get[ValueParameterDescriptorImpl]

