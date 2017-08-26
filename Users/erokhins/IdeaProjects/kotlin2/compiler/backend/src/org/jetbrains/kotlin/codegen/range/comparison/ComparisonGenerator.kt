'when {
            type.isRepresentedAsPrimitiveInt() -> IntComparisonGenerator
            type == Type.LONG_TYPE -> LongComparisonGenerator
            type == Type.FLOAT_TYPE -> FloatComparisonGenerator
            type == Type.DOUBLE_TYPE -> DoubleComparisonGenerator
            else -> throw UnsupportedOperationException("Unexpected primitive type: " + type)
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ComparisonGenerator, entry1: ComparisonGenerator, entry2: ComparisonGenerator, entry3: ComparisonGenerator, entry4: ComparisonGenerator): ComparisonGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ComparisonGenerator

'type' @ [38:13] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForPrimitiveType[ValueParameterDescriptorImpl]

'isRepresentedAsPrimitiveInt' @ [38:18] ==> private fun Type.isRepresentedAsPrimitiveInt(): Boolean defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'IntComparisonGenerator' @ [38:51] ==> public object IntComparisonGenerator : ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file IntComparisonGenerator.kt[FakeCallableDescriptorForObject]

'type' @ [39:13] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForPrimitiveType[ValueParameterDescriptorImpl]

'LONG_TYPE' @ [39:26] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LongComparisonGenerator' @ [39:39] ==> public object LongComparisonGenerator : ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file LongComparisonGenerator.kt[FakeCallableDescriptorForObject]

'type' @ [40:13] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForPrimitiveType[ValueParameterDescriptorImpl]

'FLOAT_TYPE' @ [40:26] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'FloatComparisonGenerator' @ [40:40] ==> public object FloatComparisonGenerator : FloatingPointComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file FloatingPointComparisonGenerator.kt[FakeCallableDescriptorForObject]

'type' @ [41:13] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForPrimitiveType[ValueParameterDescriptorImpl]

'DOUBLE_TYPE' @ [41:26] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'DoubleComparisonGenerator' @ [41:41] ==> public object DoubleComparisonGenerator : FloatingPointComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file FloatingPointComparisonGenerator.kt[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [42:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [42:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'type' @ [42:89] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForPrimitiveType[ValueParameterDescriptorImpl]

'call' @ [46:22] ==> value-parameter call: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [46:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'descriptor' @ [48:24] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'extensionReceiverParameter' @ [48:35] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [48:63] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [48:71] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [48:82] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [48:109] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'getRangeOrProgressionElementType' @ [50:23] ==> public fun getRangeOrProgressionElementType(rangeType: KotlinType): KotlinType? defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'receiverType' @ [50:56] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'descriptor' @ [52:30] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'valueParameters' @ [52:41] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [52:57] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [52:73] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'codegen' @ [54:26] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[ValueParameterDescriptorImpl]

'asmType' @ [54:34] ==> @NotNull public open fun asmType(@NotNull type: KotlinType): Type defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'elementType' @ [54:42] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'codegen' @ [55:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[ValueParameterDescriptorImpl]

'asmType' @ [55:41] ==> @NotNull public open fun asmType(@NotNull type: KotlinType): Type defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'valueParameterType' @ [55:49] ==> val valueParameterType: KotlinType defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'when {
        asmElementType == asmValueParameterType ->
            getComparisonGeneratorForPrimitiveType(asmElementType)

        asmElementType.isRepresentedAsPrimitiveInt() && asmValueParameterType.isRepresentedAsPrimitiveInt() ->
            IntComparisonGenerator

        asmElementType.isRepresentedAsPrimitiveInt() && asmValueParameterType == Type.LONG_TYPE ||
        asmValueParameterType.isRepresentedAsPrimitiveInt() && asmElementType == Type.LONG_TYPE ->
            LongComparisonGenerator

        asmElementType == Type.FLOAT_TYPE && asmValueParameterType == Type.DOUBLE_TYPE ||
        asmElementType == Type.DOUBLE_TYPE && asmValueParameterType == Type.FLOAT_TYPE ->
            DoubleComparisonGenerator

        else -> null
    }' @ [57:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ComparisonGenerator?, entry1: ComparisonGenerator?, entry2: ComparisonGenerator?, entry3: ComparisonGenerator?, entry4: ComparisonGenerator?): ComparisonGenerator?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ComparisonGenerator?

'asmElementType' @ [58:9] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'asmValueParameterType' @ [58:27] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'getComparisonGeneratorForPrimitiveType' @ [59:13] ==> public fun getComparisonGeneratorForPrimitiveType(type: Type): ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'asmElementType' @ [59:52] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'asmElementType' @ [61:9] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'isRepresentedAsPrimitiveInt' @ [61:24] ==> private fun Type.isRepresentedAsPrimitiveInt(): Boolean defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'asmValueParameterType' @ [61:57] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'isRepresentedAsPrimitiveInt' @ [61:79] ==> private fun Type.isRepresentedAsPrimitiveInt(): Boolean defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'IntComparisonGenerator' @ [62:13] ==> public object IntComparisonGenerator : ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file IntComparisonGenerator.kt[FakeCallableDescriptorForObject]

'asmElementType' @ [64:9] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'isRepresentedAsPrimitiveInt' @ [64:24] ==> private fun Type.isRepresentedAsPrimitiveInt(): Boolean defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'asmValueParameterType' @ [64:57] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'LONG_TYPE' @ [64:87] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmValueParameterType' @ [65:9] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'isRepresentedAsPrimitiveInt' @ [65:31] ==> private fun Type.isRepresentedAsPrimitiveInt(): Boolean defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'asmElementType' @ [65:64] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'LONG_TYPE' @ [65:87] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LongComparisonGenerator' @ [66:13] ==> public object LongComparisonGenerator : ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file LongComparisonGenerator.kt[FakeCallableDescriptorForObject]

'asmElementType' @ [68:9] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'FLOAT_TYPE' @ [68:32] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmValueParameterType' @ [68:46] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'DOUBLE_TYPE' @ [68:76] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmElementType' @ [69:9] ==> val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'DOUBLE_TYPE' @ [69:32] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmValueParameterType' @ [69:47] ==> val asmValueParameterType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.getComparisonGeneratorForRangeContainsCall[LocalVariableDescriptor]

'FLOAT_TYPE' @ [69:77] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'DoubleComparisonGenerator' @ [70:13] ==> public object DoubleComparisonGenerator : FloatingPointComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file FloatingPointComparisonGenerator.kt[FakeCallableDescriptorForObject]

'this' @ [77:9] ==> <this> defined in org.jetbrains.kotlin.codegen.range.comparison.isRepresentedAsPrimitiveInt[ReceiverParameterDescriptorImpl]

'INT_TYPE' @ [77:22] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [77:34] ==> <this> defined in org.jetbrains.kotlin.codegen.range.comparison.isRepresentedAsPrimitiveInt[ReceiverParameterDescriptorImpl]

'SHORT_TYPE' @ [77:47] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [77:61] ==> <this> defined in org.jetbrains.kotlin.codegen.range.comparison.isRepresentedAsPrimitiveInt[ReceiverParameterDescriptorImpl]

'BYTE_TYPE' @ [77:74] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [77:87] ==> <this> defined in org.jetbrains.kotlin.codegen.range.comparison.isRepresentedAsPrimitiveInt[ReceiverParameterDescriptorImpl]

'CHAR_TYPE' @ [77:100] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

