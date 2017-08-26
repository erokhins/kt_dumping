'if (TypeUtils.isNullableType(this)) Nullability.UNKNOWN else Nullability.NOT_NULL' @ [25:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'isNullableType' @ [25:27] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [25:42] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.immanentNullability[ReceiverParameterDescriptorImpl]

'UNKNOWN' @ [25:61] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'NOT_NULL' @ [25:86] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'type' @ [33:60] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.<init>[ValueParameterDescriptorImpl]

'immanentNullability' @ [33:65] ==> private val KotlinType.immanentNullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValue.kt[PropertyDescriptorImpl]

'identifierInfo' @ [35:28] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'kind' @ [35:43] ==> public open val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[PropertyDescriptorImpl]

'str' @ [37:72] ==> value-parameter str: String defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind.<init>[ValueParameterDescriptorImpl]

'' @ [41:21] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [43:34] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [46:29] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [49:30] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [52:24] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [55:26] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [58:25] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'' @ [61:14] ==> private constructor Kind(str: String, description: String = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[ClassConstructorDescriptorImpl]

'str' @ [63:35] ==> private final val str: String defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[PropertyDescriptorImpl]

'kind' @ [70:21] ==> public final val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'STABLE_VALUE' @ [70:34] ==> enum entry STABLE_VALUE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'kind' @ [70:50] ==> public final val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'STABLE_VARIABLE' @ [70:63] ==> enum entry STABLE_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'kind' @ [70:82] ==> public final val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'STABLE_COMPLEX_EXPRESSION' @ [70:95] ==> enum entry STABLE_COMPLEX_EXPRESSION defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'identifierInfo' @ [72:28] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'canBeBound' @ [72:43] ==> public open val canBeBound: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[PropertyDescriptorImpl]

'this' @ [75:13] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[LazyClassReceiverParameterDescriptor]

'other' @ [75:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.equals[ValueParameterDescriptorImpl]

'other' @ [76:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.equals[ValueParameterDescriptorImpl]

'identifierInfo' @ [78:13] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'other' @ [78:31] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.equals[ValueParameterDescriptorImpl]

'identifierInfo' @ [78:37] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'type' @ [79:13] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'other' @ [79:21] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.equals[ValueParameterDescriptorImpl]

'type' @ [79:27] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'kind' @ [84:33] ==> public final val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'identifierInfo' @ [84:39] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'immanentNullability' @ [84:55] ==> public final val immanentNullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'type' @ [86:31] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'hashCode' @ [86:36] ==> public final fun hashCode(): Int defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'*' @ [86:49] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'identifierInfo' @ [86:54] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'hashCode' @ [86:69] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [90:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DataFlowValue' @ [91:51] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'NULL' @ [91:80] ==> public object NULL : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'builtIns' @ [91:86] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion.nullValue[ValueParameterDescriptorImpl]

'nullableNothingType' @ [91:95] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'NULL' @ [91:128] ==> enum entry NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'JvmField' @ [93:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DataFlowValue' @ [94:21] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'ERROR' @ [94:50] ==> public object ERROR : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'createErrorType' @ [94:68] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'IMPOSSIBLE' @ [94:125] ==> enum entry IMPOSSIBLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

