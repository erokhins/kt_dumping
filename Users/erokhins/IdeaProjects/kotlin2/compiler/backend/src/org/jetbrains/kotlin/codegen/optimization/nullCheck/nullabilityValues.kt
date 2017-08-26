'StrictBasicValue' @ [25:40] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'type' @ [25:57] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.<init>[ValueParameterDescriptorImpl]

'other' @ [26:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.equals[ValueParameterDescriptorImpl]

'other' @ [26:79] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.equals[ValueParameterDescriptorImpl]

'type' @ [26:85] ==> public final val NotNullBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'type' @ [26:93] ==> public final val NotNullBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'NotNullBasicValue' @ [32:40] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'StrictBasicValue' @ [32:58] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'REFERENCE_VALUE' @ [32:75] ==> @JvmField public final val REFERENCE_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'type' @ [32:91] ==> public final val StrictBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'StrictBasicValue' @ [36:25] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'OBJECT_TYPE' @ [36:51] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'this' @ [40:20] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[LazyClassReceiverParameterDescriptor]

'NULL' @ [40:28] ==> enum entry NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'this' @ [41:23] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[LazyClassReceiverParameterDescriptor]

'NOT_NULL' @ [41:31] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'when (this) {
            is NullBasicValue -> Nullability.NULL
            is NotNullBasicValue -> Nullability.NOT_NULL
            is ProgressionIteratorBasicValue -> Nullability.NOT_NULL
            else -> Nullability.NULLABLE
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability, entry3: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'this' @ [45:15] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.getNullability[ReceiverParameterDescriptorImpl]

'NULL' @ [46:46] ==> enum entry NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'NOT_NULL' @ [47:49] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'NOT_NULL' @ [48:61] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'NULLABLE' @ [49:33] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

